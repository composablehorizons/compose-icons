package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Cached: ImageVector
    get() {
        if (_Cached != null) return _Cached!!
        
        _Cached = ImageVector.Builder(
            name = "cached",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 8f)
                lineToRelative(-4f, 4f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                curveToRelative(-1.01f, 0f, -1.97f, -0.25f, -2.8f, -0.7f)
                lineToRelative(-1.46f, 1.46f)
                curveTo(8.97f, 19.54f, 10.43f, 20f, 12f, 20f)
                curveToRelative(4.42f, 0f, 8f, -3.58f, 8f, -8f)
                horizontalLineToRelative(3f)
                lineToRelative(-4f, -4f)
                close()
                moveTo(6f, 12f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                curveToRelative(1.01f, 0f, 1.97f, 0.25f, 2.8f, 0.7f)
                lineToRelative(1.46f, -1.46f)
                curveTo(15.03f, 4.46f, 13.57f, 4f, 12f, 4f)
                curveToRelative(-4.42f, 0f, -8f, 3.58f, -8f, 8f)
                horizontalLineTo(1f)
                lineToRelative(4f, 4f)
                lineToRelative(4f, -4f)
                horizontalLineTo(6f)
                close()
            }
        }.build()
        
        return _Cached!!
    }

private var _Cached: ImageVector? = null


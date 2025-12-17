package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Sync: ImageVector
    get() {
        if (_Sync != null) return _Sync!!
        
        _Sync = ImageVector.Builder(
            name = "sync",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0.01f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-24f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.01f, 4f)
                verticalLineTo(1f)
                lineToRelative(-4f, 4f)
                lineToRelative(4f, 4f)
                verticalLineTo(6f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 1.01f, -0.25f, 1.97f, -0.7f, 2.8f)
                lineToRelative(1.46f, 1.46f)
                curveToRelative(0.78f, -1.23f, 1.24f, -2.69f, 1.24f, -4.26f)
                curveToRelative(0f, -4.42f, -3.58f, -8f, -8f, -8f)
                close()
                moveToRelative(0f, 14f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                curveToRelative(0f, -1.01f, 0.25f, -1.97f, 0.7f, -2.8f)
                lineTo(5.25f, 7.74f)
                curveTo(4.47f, 8.97f, 4.01f, 10.43f, 4.01f, 12f)
                curveToRelative(0f, 4.42f, 3.58f, 8f, 8f, 8f)
                verticalLineToRelative(3f)
                lineToRelative(4f, -4f)
                lineToRelative(-4f, -4f)
                verticalLineToRelative(3f)
                close()
            }
        }.build()
        
        return _Sync!!
    }

private var _Sync: ImageVector? = null


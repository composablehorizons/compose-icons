package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Addchart: ImageVector
    get() {
        if (_Addchart != null) return _Addchart!!
        
        _Addchart = ImageVector.Builder(
            name = "addchart",
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
                moveTo(22f, 5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineTo(7f)
                horizontalLineToRelative(-3f)
                verticalLineTo(5f)
                horizontalLineToRelative(3f)
                verticalLineTo(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                close()
                moveToRelative(-3f, 14f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineToRelative(6f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                close()
                moveToRelative(-4f, -6f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(-4f, 4f)
                horizontalLineToRelative(2f)
                verticalLineTo(9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(8f)
                close()
                moveToRelative(-2f, 0f)
                verticalLineToRelative(-6f)
                horizontalLineTo(7f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _Addchart!!
    }

private var _Addchart: ImageVector? = null


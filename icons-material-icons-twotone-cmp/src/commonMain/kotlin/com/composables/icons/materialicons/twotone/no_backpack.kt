package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.No_backpack: ImageVector
    get() {
        if (_No_backpack != null) return _No_backpack!!
        
        _No_backpack = ImageVector.Builder(
            name = "no_backpack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 15.17f)
                verticalLineTo(8f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(8.83f)
                lineToRelative(6f, 6f)
                horizontalLineToRelative(1.67f)
                verticalLineToRelative(1.67f)
                lineTo(18f, 15.17f)
                close()
                moveTo(17.17f, 20f)
                lineToRelative(-6f, -6f)
                horizontalLineTo(7.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.67f)
                lineTo(6f, 8.83f)
                verticalLineTo(20f)
                horizontalLineTo(17.17f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.98f, 4.15f)
                curveToRelative(0.01f, 0f, 0.01f, -0.01f, 0.02f, -0.01f)
                verticalLineTo(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineTo(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2.14f)
                curveToRelative(1.72f, 0.45f, 3f, 2f, 3f, 3.86f)
                verticalLineToRelative(9.17f)
                lineToRelative(-2f, -2f)
                verticalLineTo(8f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(8.83f)
                lineTo(6.98f, 4.15f)
                close()
                moveTo(14.83f, 12f)
                lineToRelative(1.67f, 1.67f)
                verticalLineTo(12f)
                horizontalLineTo(14.83f)
                close()
                moveTo(19.78f, 22.61f)
                lineToRelative(-0.85f, -0.85f)
                curveTo(18.65f, 21.91f, 18.34f, 22f, 18f, 22f)
                horizontalLineTo(6f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineTo(8f)
                curveToRelative(0f, -0.36f, 0.06f, -0.69f, 0.15f, -1.02f)
                lineTo(1.39f, 4.22f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(18.38f, 18.38f)
                lineTo(19.78f, 22.61f)
                close()
                moveTo(17.17f, 20f)
                lineToRelative(-6f, -6f)
                horizontalLineTo(7.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.67f)
                lineTo(6f, 8.83f)
                verticalLineTo(20f)
                horizontalLineTo(17.17f)
                close()
            }
        }.build()
        
        return _No_backpack!!
    }

private var _No_backpack: ImageVector? = null


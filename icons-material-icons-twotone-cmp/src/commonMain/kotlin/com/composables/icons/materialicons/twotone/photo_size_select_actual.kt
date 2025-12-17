package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Photo_size_select_actual: ImageVector
    get() {
        if (_Photo_size_select_actual != null) return _Photo_size_select_actual!!
        
        _Photo_size_select_actual = ImageVector.Builder(
            name = "photo_size_select_actual",
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
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.08f, 5f)
                lineTo(3f, 5.08f)
                verticalLineTo(19f)
                horizontalLineToRelative(17.92f)
                curveToRelative(0.03f, -0.02f, 0.06f, -0.06f, 0.08f, -0.08f)
                verticalLineTo(5.08f)
                lineTo(20.92f, 5f)
                horizontalLineTo(3.08f)
                close()
                moveTo(5f, 17f)
                lineToRelative(3.5f, -4.5f)
                lineToRelative(2.5f, 3.01f)
                lineTo(14.5f, 11f)
                lineToRelative(4.5f, 6f)
                horizontalLineTo(5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 3f)
                horizontalLineTo(3f)
                curveTo(2f, 3f, 1f, 4f, 1f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(18f)
                curveToRelative(1f, 0f, 2f, -1f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1f, -1f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 15.92f)
                curveToRelative(-0.02f, 0.03f, -0.06f, 0.06f, -0.08f, 0.08f)
                horizontalLineTo(3f)
                verticalLineTo(5.08f)
                lineTo(3.08f, 5f)
                horizontalLineToRelative(17.83f)
                curveToRelative(0.03f, 0.02f, 0.06f, 0.06f, 0.08f, 0.08f)
                verticalLineToRelative(13.84f)
                close()
                moveToRelative(-10f, -3.41f)
                lineTo(8.5f, 12.5f)
                lineTo(5f, 17f)
                horizontalLineToRelative(14f)
                lineToRelative(-4.5f, -6f)
                close()
            }
        }.build()
        
        return _Photo_size_select_actual!!
    }

private var _Photo_size_select_actual: ImageVector? = null


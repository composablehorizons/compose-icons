package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Power_off: ImageVector
    get() {
        if (_Power_off != null) return _Power_off!!
        
        _Power_off = ImageVector.Builder(
            name = "power_off",
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
                moveTo(12.12f, 9f)
                lineTo(16f, 12.88f)
                verticalLineTo(9f)
                close()
                moveToRelative(-0.62f, 8.17f)
                verticalLineTo(19f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1.83f)
                lineToRelative(1.07f, -1.06f)
                lineTo(8f, 10.54f)
                verticalLineToRelative(3.11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 3f)
                horizontalLineTo(8f)
                verticalLineToRelative(1.88f)
                lineToRelative(2f, 2f)
                close()
                moveToRelative(6f, 6f)
                verticalLineToRelative(3.88f)
                lineToRelative(1.8f, 1.8f)
                lineToRelative(0.2f, -0.2f)
                verticalLineTo(9f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                verticalLineTo(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3.88f)
                lineToRelative(2f, 2f)
                horizontalLineTo(16f)
                close()
                moveTo(4.12f, 3.84f)
                lineTo(2.71f, 5.25f)
                lineTo(6f, 8.54f)
                verticalLineToRelative(5.96f)
                lineTo(9.5f, 18f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3f)
                lineToRelative(0.48f, -0.48f)
                lineToRelative(4.47f, 4.47f)
                lineToRelative(1.41f, -1.41f)
                lineTo(4.12f, 3.84f)
                close()
                moveToRelative(8.38f, 13.33f)
                verticalLineTo(19f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1.83f)
                lineTo(8f, 13.65f)
                verticalLineToRelative(-3.11f)
                lineToRelative(5.57f, 5.57f)
                lineToRelative(-1.07f, 1.06f)
                close()
            }
        }.build()
        
        return _Power_off!!
    }

private var _Power_off: ImageVector? = null


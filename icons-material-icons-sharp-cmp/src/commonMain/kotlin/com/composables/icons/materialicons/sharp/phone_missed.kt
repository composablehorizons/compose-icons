package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Phone_missed: ImageVector
    get() {
        if (_Phone_missed != null) return _Phone_missed!!
        
        _Phone_missed = ImageVector.Builder(
            name = "phone_missed",
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
                moveTo(23.32f, 16.67f)
                curveToRelative(-2.95f, -2.79f, -6.93f, -4.51f, -11.31f, -4.51f)
                curveToRelative(-4.39f, 0f, -8.37f, 1.72f, -11.31f, 4.51f)
                lineToRelative(-0.69f, 0.69f)
                lineTo(3.65f, 21f)
                lineToRelative(3.93f, -2.72f)
                lineToRelative(-0.01f, -3.49f)
                curveToRelative(1.4f, -0.45f, 2.9f, -0.7f, 4.44f, -0.7f)
                curveToRelative(1.55f, 0f, 3.04f, 0.24f, 4.44f, 0.7f)
                lineToRelative(-0.01f, 3.49f)
                lineTo(20.37f, 21f)
                lineToRelative(3.64f, -3.64f)
                curveToRelative(0f, -0.01f, -0.52f, -0.52f, -0.69f, -0.69f)
                close()
                moveTo(7f, 6.43f)
                lineToRelative(4.94f, 4.94f)
                lineToRelative(7.07f, -7.07f)
                lineToRelative(-1.41f, -1.42f)
                lineToRelative(-5.66f, 5.66f)
                lineTo(8.4f, 5f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _Phone_missed!!
    }

private var _Phone_missed: ImageVector? = null


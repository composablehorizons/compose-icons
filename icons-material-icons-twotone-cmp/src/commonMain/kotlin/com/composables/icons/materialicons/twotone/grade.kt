package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Grade: ImageVector
    get() {
        if (_Grade != null) return _Grade!!
        
        _Grade = ImageVector.Builder(
            name = "grade",
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
                moveTo(17.11f, 10.83f)
                lineToRelative(-2.47f, -0.21f)
                lineToRelative(-1.2f, -0.1f)
                lineToRelative(-0.47f, -1.11f)
                lineTo(12f, 7.13f)
                lineToRelative(-0.97f, 2.28f)
                lineToRelative(-0.47f, 1.11f)
                lineToRelative(-1.2f, 0.1f)
                lineToRelative(-2.47f, 0.21f)
                lineToRelative(1.88f, 1.63f)
                lineToRelative(0.91f, 0.79f)
                lineToRelative(-0.27f, 1.17f)
                lineToRelative(-0.57f, 2.42f)
                lineToRelative(2.13f, -1.28f)
                lineToRelative(1.03f, -0.63f)
                lineToRelative(1.03f, 0.63f)
                lineToRelative(2.13f, 1.28f)
                lineToRelative(-0.57f, -2.42f)
                lineToRelative(-0.27f, -1.17f)
                lineToRelative(0.91f, -0.79f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22f, 9.24f)
                lineToRelative(-7.19f, -0.61f)
                lineTo(12f, 2f)
                lineTo(9.19f, 8.63f)
                lineTo(2f, 9.24f)
                lineToRelative(5.46f, 4.73f)
                lineTo(5.82f, 21f)
                lineTo(12f, 17.27f)
                lineTo(18.18f, 21f)
                lineToRelative(-1.64f, -7.03f)
                lineTo(22f, 9.24f)
                close()
                moveToRelative(-7.41f, 5.18f)
                lineToRelative(0.56f, 2.41f)
                lineToRelative(-2.12f, -1.28f)
                lineToRelative(-1.03f, -0.62f)
                lineToRelative(-1.03f, 0.62f)
                lineToRelative(-2.12f, 1.28f)
                lineToRelative(0.56f, -2.41f)
                lineToRelative(0.27f, -1.18f)
                lineToRelative(-0.91f, -0.79f)
                lineToRelative(-1.88f, -1.63f)
                lineToRelative(2.47f, -0.21f)
                lineToRelative(1.2f, -0.1f)
                lineToRelative(0.47f, -1.11f)
                lineToRelative(0.97f, -2.27f)
                lineToRelative(0.97f, 2.29f)
                lineToRelative(0.47f, 1.11f)
                lineToRelative(1.2f, 0.1f)
                lineToRelative(2.47f, 0.21f)
                lineToRelative(-1.88f, 1.63f)
                lineToRelative(-0.91f, 0.79f)
                lineToRelative(0.27f, 1.16f)
                close()
            }
        }.build()
        
        return _Grade!!
    }

private var _Grade: ImageVector? = null


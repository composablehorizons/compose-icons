package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Grade: ImageVector
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
                moveTo(12f, 17.27f)
                lineToRelative(5.17f, 3.12f)
                curveToRelative(0.38f, 0.23f, 0.85f, -0.11f, 0.75f, -0.54f)
                lineToRelative(-1.37f, -5.88f)
                lineToRelative(4.56f, -3.95f)
                curveToRelative(0.33f, -0.29f, 0.16f, -0.84f, -0.29f, -0.88f)
                lineToRelative(-6.01f, -0.51f)
                lineToRelative(-2.35f, -5.54f)
                curveToRelative(-0.17f, -0.41f, -0.75f, -0.41f, -0.92f, 0f)
                lineTo(9.19f, 8.63f)
                lineToRelative(-6.01f, 0.51f)
                curveToRelative(-0.44f, 0.04f, -0.62f, 0.59f, -0.28f, 0.88f)
                lineToRelative(4.56f, 3.95f)
                lineToRelative(-1.37f, 5.88f)
                curveToRelative(-0.1f, 0.43f, 0.37f, 0.77f, 0.75f, 0.54f)
                lineTo(12f, 17.27f)
                close()
            }
        }.build()
        
        return _Grade!!
    }

private var _Grade: ImageVector? = null


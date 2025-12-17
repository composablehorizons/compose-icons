package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Phone_forwarded: ImageVector
    get() {
        if (_Phone_forwarded != null) return _Phone_forwarded!!
        
        _Phone_forwarded = ImageVector.Builder(
            name = "phone_forwarded",
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
                moveTo(22.65f, 5.65f)
                lineToRelative(-3.79f, -3.79f)
                curveToRelative(-0.32f, -0.32f, -0.86f, -0.1f, -0.86f, 0.35f)
                verticalLineTo(4f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineTo(18f)
                verticalLineToRelative(1.79f)
                curveToRelative(0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f)
                lineToRelative(3.79f, -3.79f)
                curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0.01f, -0.7f)
                close()
                moveToRelative(-3.42f, 9.61f)
                lineToRelative(-2.54f, -0.29f)
                curveToRelative(-0.61f, -0.07f, -1.21f, 0.14f, -1.64f, 0.57f)
                lineToRelative(-1.84f, 1.84f)
                curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f)
                lineToRelative(1.85f, -1.85f)
                curveToRelative(0.43f, -0.43f, 0.64f, -1.03f, 0.57f, -1.64f)
                lineToRelative(-0.29f, -2.52f)
                curveToRelative(-0.12f, -1.01f, -0.97f, -1.77f, -1.99f, -1.77f)
                horizontalLineTo(5.03f)
                curveToRelative(-1.13f, 0f, -2.07f, 0.94f, -2f, 2.07f)
                curveToRelative(0.53f, 8.54f, 7.36f, 15.36f, 15.89f, 15.89f)
                curveToRelative(1.13f, 0.07f, 2.07f, -0.87f, 2.07f, -2f)
                verticalLineToRelative(-1.73f)
                curveToRelative(0.01f, -1.01f, -0.75f, -1.86f, -1.76f, -1.98f)
                close()
            }
        }.build()
        
        return _Phone_forwarded!!
    }

private var _Phone_forwarded: ImageVector? = null


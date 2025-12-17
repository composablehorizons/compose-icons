package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Call_end: ImageVector
    get() {
        if (_Call_end != null) return _Call_end!!
        
        _Call_end = ImageVector.Builder(
            name = "call_end",
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
                moveTo(18.59f, 12.23f)
                curveToRelative(0.67f, 0.38f, 1.3f, 0.8f, 1.88f, 1.27f)
                lineToRelative(1.07f, -1.07f)
                curveToRelative(-0.92f, -0.75f, -1.91f, -1.39f, -2.96f, -1.91f)
                verticalLineToRelative(1.71f)
                close()
                moveTo(3.53f, 13.49f)
                curveToRelative(0.59f, -0.48f, 1.22f, -0.9f, 1.87f, -1.27f)
                verticalLineToRelative(-1.7f)
                curveToRelative(-1.04f, 0.51f, -2.03f, 1.15f, -2.94f, 1.9f)
                lineToRelative(1.07f, 1.07f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 7f)
                curveTo(7.46f, 7f, 3.34f, 8.78f, 0.29f, 11.67f)
                curveToRelative(-0.18f, 0.18f, -0.29f, 0.43f, -0.29f, 0.71f)
                curveToRelative(0f, 0.28f, 0.11f, 0.53f, 0.29f, 0.7f)
                lineToRelative(2.48f, 2.48f)
                curveToRelative(0.18f, 0.18f, 0.43f, 0.29f, 0.71f, 0.29f)
                curveToRelative(0.27f, 0f, 0.52f, -0.1f, 0.7f, -0.28f)
                curveToRelative(0.79f, -0.73f, 1.68f, -1.36f, 2.66f, -1.85f)
                curveToRelative(0.33f, -0.16f, 0.56f, -0.51f, 0.56f, -0.9f)
                verticalLineToRelative(-3.1f)
                curveTo(8.85f, 9.25f, 10.4f, 9f, 12f, 9f)
                curveToRelative(1.6f, 0f, 3.15f, 0.25f, 4.59f, 0.73f)
                verticalLineToRelative(3.1f)
                curveToRelative(0f, 0.4f, 0.23f, 0.74f, 0.56f, 0.9f)
                curveToRelative(0.98f, 0.49f, 1.88f, 1.11f, 2.67f, 1.85f)
                curveToRelative(0.18f, 0.17f, 0.43f, 0.28f, 0.7f, 0.28f)
                curveToRelative(0.28f, 0f, 0.53f, -0.11f, 0.71f, -0.29f)
                lineToRelative(2.48f, -2.48f)
                curveToRelative(0.18f, -0.18f, 0.29f, -0.43f, 0.29f, -0.71f)
                curveToRelative(0f, -0.28f, -0.11f, -0.53f, -0.29f, -0.71f)
                curveTo(20.66f, 8.78f, 16.54f, 7f, 12f, 7f)
                close()
                moveToRelative(-6.6f, 5.22f)
                curveToRelative(-0.65f, 0.37f, -1.28f, 0.79f, -1.87f, 1.27f)
                lineToRelative(-1.07f, -1.07f)
                curveToRelative(0.91f, -0.75f, 1.9f, -1.38f, 2.94f, -1.9f)
                verticalLineToRelative(1.7f)
                close()
                moveToRelative(15.07f, 1.28f)
                curveToRelative(-0.58f, -0.47f, -1.21f, -0.89f, -1.88f, -1.27f)
                verticalLineToRelative(-1.71f)
                curveToRelative(1.05f, 0.51f, 2.04f, 1.15f, 2.96f, 1.91f)
                lineToRelative(-1.08f, 1.07f)
                close()
            }
        }.build()
        
        return _Call_end!!
    }

private var _Call_end: ImageVector? = null


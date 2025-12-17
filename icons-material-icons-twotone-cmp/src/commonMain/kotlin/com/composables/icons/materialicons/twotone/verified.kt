package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Verified: ImageVector
    get() {
        if (_Verified != null) return _Verified!!
        
        _Verified = ImageVector.Builder(
            name = "verified",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
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
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18.49f, 9.88f)
                        lineToRelative(0.08f, -0.85f)
                        lineToRelative(0.18f, -1.95f)
                        lineToRelative(-1.9f, -0.43f)
                        lineToRelative(-0.84f, -0.19f)
                        lineToRelative(-0.44f, -0.74f)
                        lineToRelative(-0.99f, -1.68f)
                        lineTo(12.79f, 4.8f)
                        lineTo(12f, 5.14f)
                        lineTo(11.21f, 4.8f)
                        lineTo(9.42f, 4.03f)
                        lineTo(8.43f, 5.71f)
                        lineTo(7.99f, 6.45f)
                        lineTo(7.15f, 6.64f)
                        lineToRelative(-1.9f, 0.43f)
                        lineToRelative(0.18f, 1.94f)
                        lineToRelative(0.08f, 0.85f)
                        lineToRelative(-0.56f, 0.65f)
                        lineToRelative(-1.29f, 1.48f)
                        lineToRelative(1.29f, 1.47f)
                        lineToRelative(0.56f, 0.65f)
                        lineToRelative(-0.08f, 0.85f)
                        lineToRelative(-0.18f, 1.96f)
                        lineToRelative(1.9f, 0.43f)
                        lineToRelative(0.84f, 0.19f)
                        lineToRelative(0.44f, 0.74f)
                        lineToRelative(0.99f, 1.67f)
                        lineToRelative(1.78f, -0.77f)
                        lineTo(12f, 18.85f)
                        lineToRelative(0.79f, 0.34f)
                        lineToRelative(1.78f, 0.77f)
                        lineToRelative(0.99f, -1.68f)
                        lineToRelative(0.44f, -0.74f)
                        lineToRelative(0.84f, -0.19f)
                        lineToRelative(1.9f, -0.43f)
                        lineToRelative(-0.18f, -1.95f)
                        lineToRelative(-0.08f, -0.85f)
                        lineToRelative(0.56f, -0.65f)
                        lineToRelative(1.29f, -1.47f)
                        lineToRelative(-1.29f, -1.47f)
                        lineTo(18.49f, 9.88f)
                        close()
                        moveTo(10.09f, 16.72f)
                        lineToRelative(-3.8f, -3.81f)
                        lineToRelative(1.48f, -1.48f)
                        lineToRelative(2.32f, 2.33f)
                        lineToRelative(5.85f, -5.87f)
                        lineToRelative(1.48f, 1.48f)
                        lineTo(10.09f, 16.72f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(23f, 11.99f)
                        lineToRelative(-2.44f, -2.79f)
                        lineToRelative(0.34f, -3.69f)
                        lineToRelative(-3.61f, -0.82f)
                        lineTo(15.4f, 1.5f)
                        lineTo(12f, 2.96f)
                        lineTo(8.6f, 1.5f)
                        lineTo(6.71f, 4.69f)
                        lineTo(3.1f, 5.5f)
                        lineTo(3.44f, 9.2f)
                        lineTo(1f, 11.99f)
                        lineToRelative(2.44f, 2.79f)
                        lineToRelative(-0.34f, 3.7f)
                        lineToRelative(3.61f, 0.82f)
                        lineTo(8.6f, 22.5f)
                        lineToRelative(3.4f, -1.47f)
                        lineToRelative(3.4f, 1.46f)
                        lineToRelative(1.89f, -3.19f)
                        lineToRelative(3.61f, -0.82f)
                        lineToRelative(-0.34f, -3.69f)
                        lineTo(23f, 11.99f)
                        close()
                        moveTo(19.05f, 13.47f)
                        lineToRelative(-0.56f, 0.65f)
                        lineToRelative(0.08f, 0.85f)
                        lineToRelative(0.18f, 1.95f)
                        lineToRelative(-1.9f, 0.43f)
                        lineToRelative(-0.84f, 0.19f)
                        lineToRelative(-0.44f, 0.74f)
                        lineToRelative(-0.99f, 1.68f)
                        lineToRelative(-1.78f, -0.77f)
                        lineTo(12f, 18.85f)
                        lineToRelative(-0.79f, 0.34f)
                        lineToRelative(-1.78f, 0.77f)
                        lineToRelative(-0.99f, -1.67f)
                        lineToRelative(-0.44f, -0.74f)
                        lineToRelative(-0.84f, -0.19f)
                        lineToRelative(-1.9f, -0.43f)
                        lineToRelative(0.18f, -1.96f)
                        lineToRelative(0.08f, -0.85f)
                        lineToRelative(-0.56f, -0.65f)
                        lineToRelative(-1.29f, -1.47f)
                        lineToRelative(1.29f, -1.48f)
                        lineToRelative(0.56f, -0.65f)
                        lineTo(5.43f, 9.01f)
                        lineTo(5.25f, 7.07f)
                        lineToRelative(1.9f, -0.43f)
                        lineToRelative(0.84f, -0.19f)
                        lineToRelative(0.44f, -0.74f)
                        lineToRelative(0.99f, -1.68f)
                        lineToRelative(1.78f, 0.77f)
                        lineTo(12f, 5.14f)
                        lineToRelative(0.79f, -0.34f)
                        lineToRelative(1.78f, -0.77f)
                        lineToRelative(0.99f, 1.68f)
                        lineToRelative(0.44f, 0.74f)
                        lineToRelative(0.84f, 0.19f)
                        lineToRelative(1.9f, 0.43f)
                        lineToRelative(-0.18f, 1.95f)
                        lineToRelative(-0.08f, 0.85f)
                        lineToRelative(0.56f, 0.65f)
                        lineToRelative(1.29f, 1.47f)
                        lineTo(19.05f, 13.47f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10.09f, 13.75f)
                        lineTo(7.77f, 11.42f)
                        lineTo(6.29f, 12.91f)
                        lineTo(10.09f, 16.72f)
                        lineTo(17.43f, 9.36f)
                        lineTo(15.95f, 7.87f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Verified!!
    }

private var _Verified: ImageVector? = null


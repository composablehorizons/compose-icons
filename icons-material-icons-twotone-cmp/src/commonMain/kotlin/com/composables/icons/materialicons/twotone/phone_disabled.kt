package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Phone_disabled: ImageVector
    get() {
        if (_Phone_disabled != null) return _Phone_disabled!!
        
        _Phone_disabled = ImageVector.Builder(
            name = "phone_disabled",
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
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17.34f, 14.54f)
                        lineToRelative(-1.43f, -1.43f)
                        curveToRelative(0.56f, -0.73f, 1.05f, -1.5f, 1.47f, -2.32f)
                        lineToRelative(-2.2f, -2.2f)
                        curveToRelative(-0.28f, -0.28f, -0.36f, -0.67f, -0.25f, -1.02f)
                        curveTo(15.3f, 6.45f, 15.5f, 5.25f, 15.5f, 4f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineTo(20f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        curveTo(21f, 7.98f, 19.63f, 11.64f, 17.34f, 14.54f)
                        close()
                        moveTo(14.52f, 17.35f)
                        curveTo(11.63f, 19.64f, 7.97f, 21f, 4f, 21f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        verticalLineToRelative(-3.49f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        curveToRelative(1.24f, 0f, 2.45f, -0.2f, 3.57f, -0.57f)
                        curveToRelative(0.1f, -0.04f, 0.21f, -0.05f, 0.31f, -0.05f)
                        curveToRelative(0.26f, 0f, 0.51f, 0.1f, 0.71f, 0.29f)
                        lineToRelative(2.2f, 2.2f)
                        curveToRelative(0.81f, -0.42f, 1.58f, -0.9f, 2.3f, -1.46f)
                        lineTo(1.39f, 4.22f)
                        lineToRelative(1.42f, -1.41f)
                        lineTo(21.19f, 21.2f)
                        lineToRelative(-1.41f, 1.41f)
                        lineTo(14.52f, 17.35f)
                        close()
                        moveTo(17.46f, 5f)
                        curveToRelative(-0.06f, 0.89f, -0.21f, 1.76f, -0.45f, 2.59f)
                        lineToRelative(1.2f, 1.2f)
                        curveToRelative(0.41f, -1.2f, 0.67f, -2.47f, 0.76f, -3.79f)
                        horizontalLineTo(17.46f)
                        close()
                        moveTo(7.6f, 17.02f)
                        curveToRelative(-0.85f, 0.24f, -1.72f, 0.39f, -2.6f, 0.45f)
                        verticalLineToRelative(1.49f)
                        curveToRelative(1.32f, -0.09f, 2.59f, -0.35f, 3.8f, -0.75f)
                        lineTo(7.6f, 17.02f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Phone_disabled!!
    }

private var _Phone_disabled: ImageVector? = null


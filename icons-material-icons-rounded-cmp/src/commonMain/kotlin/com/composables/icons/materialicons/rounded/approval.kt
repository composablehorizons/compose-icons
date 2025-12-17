package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Approval: ImageVector
    get() {
        if (_Approval != null) return _Approval!!
        
        _Approval = ImageVector.Builder(
            name = "approval",
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
                        moveTo(4f, 16f)
                        verticalLineToRelative(4f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(12f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-4f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineTo(6f)
                        curveTo(4.9f, 14f, 4f, 14.9f, 4f, 16f)
                        close()
                        moveTo(17f, 18f)
                        horizontalLineTo(7f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(10f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(0f)
                        curveTo(18f, 17.55f, 17.55f, 18f, 17f, 18f)
                        close()
                        moveTo(12f, 2f)
                        curveTo(9.54f, 2f, 7.48f, 3.79f, 7.07f, 6.13f)
                        curveTo(6.99f, 6.65f, 7.13f, 7.18f, 7.43f, 7.6f)
                        lineToRelative(3.76f, 5.26f)
                        curveToRelative(0.4f, 0.56f, 1.23f, 0.56f, 1.63f, 0f)
                        lineToRelative(3.76f, -5.26f)
                        curveToRelative(0.3f, -0.42f, 0.44f, -0.95f, 0.35f, -1.47f)
                        curveTo(16.52f, 3.79f, 14.46f, 2f, 12f, 2f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Approval!!
    }

private var _Approval: ImageVector? = null


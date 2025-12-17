package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Dinner_dining: ImageVector
    get() {
        if (_Dinner_dining != null) return _Dinner_dining!!
        
        _Dinner_dining = ImageVector.Builder(
            name = "dinner_dining",
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
                        moveTo(17.08f, 15.14f)
                        curveTo(16.41f, 14.4f, 15.49f, 14f, 14.5f, 14f)
                        curveToRelative(-1.35f, 0f, -2.58f, 0.79f, -3.16f, 2f)
                        horizontalLineToRelative(6.32f)
                        curveTo(17.52f, 15.69f, 17.32f, 15.4f, 17.08f, 15.14f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2f, 19f)
                        lineTo(4f, 21f)
                        lineTo(20f, 21f)
                        lineTo(22f, 19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3f, 18f)
                        horizontalLineToRelative(16.97f)
                        curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                        curveToRelative(0.29f, -3.26f, -2.28f, -6f, -5.48f, -6f)
                        curveToRelative(-2.35f, 0f, -4.35f, 1.48f, -5.14f, 3.55f)
                        curveTo(8.94f, 15.32f, 8.48f, 15.17f, 8f, 15.08f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(1.75f)
                        curveTo(10.99f, 9f, 12f, 7.99f, 12f, 6.75f)
                        horizontalLineToRelative(9f)
                        verticalLineToRelative(-1.5f)
                        horizontalLineToRelative(-9f)
                        curveTo(12f, 4.01f, 10.99f, 3f, 9.75f, 3f)
                        horizontalLineTo(3f)
                        verticalLineToRelative(1.5f)
                        horizontalLineToRelative(1f)
                        verticalLineToRelative(0.75f)
                        horizontalLineTo(3f)
                        verticalLineToRelative(1.5f)
                        horizontalLineToRelative(1f)
                        verticalLineTo(7.5f)
                        horizontalLineTo(3f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(1f)
                        verticalLineToRelative(7.39f)
                        curveTo(3.56f, 16.85f, 3.22f, 17.39f, 3f, 18f)
                        close()
                        moveTo(14.5f, 14f)
                        curveToRelative(0.99f, 0f, 1.91f, 0.4f, 2.58f, 1.14f)
                        curveToRelative(0.24f, 0.26f, 0.44f, 0.55f, 0.58f, 0.86f)
                        horizontalLineToRelative(-6.32f)
                        curveTo(11.92f, 14.79f, 13.15f, 14f, 14.5f, 14f)
                        close()
                        moveTo(8f, 4.5f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(0.75f)
                        horizontalLineTo(8f)
                        verticalLineTo(4.5f)
                        close()
                        moveTo(8f, 6.75f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(7.5f)
                        horizontalLineTo(8f)
                        verticalLineTo(6.75f)
                        close()
                        moveTo(5.5f, 4.5f)
                        horizontalLineToRelative(1f)
                        verticalLineToRelative(0.75f)
                        horizontalLineToRelative(-1f)
                        verticalLineTo(4.5f)
                        close()
                        moveTo(5.5f, 6.75f)
                        horizontalLineToRelative(1f)
                        verticalLineTo(7.5f)
                        horizontalLineToRelative(-1f)
                        verticalLineTo(6.75f)
                        close()
                        moveTo(5.5f, 9f)
                        horizontalLineToRelative(1f)
                        verticalLineToRelative(6.06f)
                        curveToRelative(-0.35f, 0.06f, -0.68f, 0.17f, -1f, 0.3f)
                        verticalLineTo(9f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Dinner_dining!!
    }

private var _Dinner_dining: ImageVector? = null


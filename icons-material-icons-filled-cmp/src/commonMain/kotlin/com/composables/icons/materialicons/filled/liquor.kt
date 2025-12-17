package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Liquor: ImageVector
    get() {
        if (_Liquor != null) return _Liquor!!
        
        _Liquor = ImageVector.Builder(
            name = "liquor",
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
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(3f, 14f)
                            curveToRelative(0f, 1.3f, 0.84f, 2.4f, 2f, 2.82f)
                            verticalLineTo(20f)
                            horizontalLineTo(3f)
                            verticalLineToRelative(2f)
                            horizontalLineToRelative(6f)
                            verticalLineToRelative(-2f)
                            horizontalLineTo(7f)
                            verticalLineToRelative(-3.18f)
                            curveTo(8.16f, 16.4f, 9f, 15.3f, 9f, 14f)
                            verticalLineTo(6f)
                            horizontalLineTo(3f)
                            verticalLineTo(14f)
                            close()
                            moveTo(5f, 8f)
                            horizontalLineToRelative(2f)
                            verticalLineToRelative(3f)
                            horizontalLineTo(5f)
                            verticalLineTo(8f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(20.63f, 8.54f)
                            lineToRelative(-0.95f, -0.32f)
                            curveTo(19.28f, 8.09f, 19f, 7.71f, 19f, 7.28f)
                            verticalLineTo(3f)
                            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                            horizontalLineToRelative(-3f)
                            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                            verticalLineToRelative(4.28f)
                            curveToRelative(0f, 0.43f, -0.28f, 0.81f, -0.68f, 0.95f)
                            lineToRelative(-0.95f, 0.32f)
                            curveTo(11.55f, 8.82f, 11f, 9.58f, 11f, 10.44f)
                            verticalLineTo(20f)
                            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                            horizontalLineToRelative(7f)
                            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                            verticalLineToRelative(-9.56f)
                            curveTo(22f, 9.58f, 21.45f, 8.82f, 20.63f, 8.54f)
                            close()
                            moveTo(16f, 4f)
                            horizontalLineToRelative(1f)
                            verticalLineToRelative(1f)
                            horizontalLineToRelative(-1f)
                            verticalLineTo(4f)
                            close()
                            moveTo(13f, 10.44f)
                            lineToRelative(0.95f, -0.32f)
                            curveTo(15.18f, 9.72f, 16f, 8.57f, 16f, 7.28f)
                            verticalLineTo(7f)
                            horizontalLineToRelative(1f)
                            verticalLineToRelative(0.28f)
                            curveToRelative(0f, 1.29f, 0.82f, 2.44f, 2.05f, 2.85f)
                            lineTo(20f, 10.44f)
                            verticalLineTo(12f)
                            horizontalLineToRelative(-7f)
                            verticalLineTo(10.44f)
                            close()
                            moveTo(20f, 20f)
                            horizontalLineToRelative(-7f)
                            verticalLineToRelative(-2f)
                            horizontalLineToRelative(7f)
                            verticalLineTo(20f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Liquor!!
    }

private var _Liquor: ImageVector? = null


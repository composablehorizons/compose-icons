package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Storefront: ImageVector
    get() {
        if (_Storefront != null) return _Storefront!!
        
        _Storefront = ImageVector.Builder(
            name = "storefront",
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
                }
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21.9f, 8.89f)
                        lineToRelative(-1.05f, -4.37f)
                        curveToRelative(-0.22f, -0.9f, -1f, -1.52f, -1.91f, -1.52f)
                        horizontalLineTo(5.05f)
                        curveTo(4.15f, 3f, 3.36f, 3.63f, 3.15f, 4.52f)
                        lineTo(2.1f, 8.89f)
                        curveToRelative(-0.24f, 1.02f, -0.02f, 2.06f, 0.62f, 2.88f)
                        curveTo(2.8f, 11.88f, 2.91f, 11.96f, 3f, 12.06f)
                        verticalLineTo(19f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(14f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-6.94f)
                        curveToRelative(0.09f, -0.09f, 0.2f, -0.18f, 0.28f, -0.28f)
                        curveTo(21.92f, 10.96f, 22.15f, 9.91f, 21.9f, 8.89f)
                        close()
                        moveTo(18.91f, 4.99f)
                        lineToRelative(1.05f, 4.37f)
                        curveToRelative(0.1f, 0.42f, 0.01f, 0.84f, -0.25f, 1.17f)
                        curveTo(19.57f, 10.71f, 19.27f, 11f, 18.77f, 11f)
                        curveToRelative(-0.61f, 0f, -1.14f, -0.49f, -1.21f, -1.14f)
                        lineTo(16.98f, 5f)
                        lineTo(18.91f, 4.99f)
                        close()
                        moveTo(13f, 5f)
                        horizontalLineToRelative(1.96f)
                        lineToRelative(0.54f, 4.52f)
                        curveToRelative(0.05f, 0.39f, -0.07f, 0.78f, -0.33f, 1.07f)
                        curveTo(14.95f, 10.85f, 14.63f, 11f, 14.22f, 11f)
                        curveTo(13.55f, 11f, 13f, 10.41f, 13f, 9.69f)
                        verticalLineTo(5f)
                        close()
                        moveTo(8.49f, 9.52f)
                        lineTo(9.04f, 5f)
                        horizontalLineTo(11f)
                        verticalLineToRelative(4.69f)
                        curveTo(11f, 10.41f, 10.45f, 11f, 9.71f, 11f)
                        curveToRelative(-0.34f, 0f, -0.65f, -0.15f, -0.89f, -0.41f)
                        curveTo(8.57f, 10.3f, 8.45f, 9.91f, 8.49f, 9.52f)
                        close()
                        moveTo(4.04f, 9.36f)
                        lineTo(5.05f, 5f)
                        horizontalLineToRelative(1.97f)
                        lineTo(6.44f, 9.86f)
                        curveTo(6.36f, 10.51f, 5.84f, 11f, 5.23f, 11f)
                        curveToRelative(-0.49f, 0f, -0.8f, -0.29f, -0.93f, -0.47f)
                        curveTo(4.03f, 10.21f, 3.94f, 9.78f, 4.04f, 9.36f)
                        close()
                        moveTo(5f, 19f)
                        verticalLineToRelative(-6.03f)
                        curveTo(5.08f, 12.98f, 5.15f, 13f, 5.23f, 13f)
                        curveToRelative(0.87f, 0f, 1.66f, -0.36f, 2.24f, -0.95f)
                        curveToRelative(0.6f, 0.6f, 1.4f, 0.95f, 2.31f, 0.95f)
                        curveToRelative(0.87f, 0f, 1.65f, -0.36f, 2.23f, -0.93f)
                        curveToRelative(0.59f, 0.57f, 1.39f, 0.93f, 2.29f, 0.93f)
                        curveToRelative(0.84f, 0f, 1.64f, -0.35f, 2.24f, -0.95f)
                        curveToRelative(0.58f, 0.59f, 1.37f, 0.95f, 2.24f, 0.95f)
                        curveToRelative(0.08f, 0f, 0.15f, -0.02f, 0.23f, -0.03f)
                        verticalLineTo(19f)
                        horizontalLineTo(5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Storefront!!
    }

private var _Storefront: ImageVector? = null


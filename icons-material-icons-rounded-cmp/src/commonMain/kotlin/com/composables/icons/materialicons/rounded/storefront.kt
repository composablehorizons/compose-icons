package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Storefront: ImageVector
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(21.9f, 7.89f)
                    lineToRelative(-1.05f, -3.37f)
                    curveToRelative(-0.22f, -0.9f, -1f, -1.52f, -1.91f, -1.52f)
                    horizontalLineTo(5.05f)
                    curveToRelative(-0.9f, 0f, -1.69f, 0.63f, -1.9f, 1.52f)
                    lineTo(2.1f, 7.89f)
                    curveTo(1.64f, 9.86f, 2.95f, 11f, 3f, 11.06f)
                    verticalLineTo(19f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(14f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineToRelative(-7.94f)
                    curveTo(22.12f, 9.94f, 22.09f, 8.65f, 21.9f, 7.89f)
                    close()
                    moveTo(13f, 5f)
                    horizontalLineToRelative(1.96f)
                    lineToRelative(0.54f, 3.52f)
                    curveTo(15.59f, 9.23f, 15.11f, 10f, 14.22f, 10f)
                    curveTo(13.55f, 10f, 13f, 9.41f, 13f, 8.69f)
                    verticalLineTo(5f)
                    close()
                    moveTo(6.44f, 8.86f)
                    curveTo(6.36f, 9.51f, 5.84f, 10f, 5.23f, 10f)
                    curveTo(4.3f, 10f, 3.88f, 9.03f, 4.04f, 8.36f)
                    lineTo(5.05f, 5f)
                    horizontalLineToRelative(1.97f)
                    lineTo(6.44f, 8.86f)
                    close()
                    moveTo(11f, 8.69f)
                    curveTo(11f, 9.41f, 10.45f, 10f, 9.71f, 10f)
                    curveToRelative(-0.75f, 0f, -1.3f, -0.7f, -1.22f, -1.48f)
                    lineTo(9.04f, 5f)
                    horizontalLineTo(11f)
                    verticalLineTo(8.69f)
                    close()
                    moveTo(18.77f, 10f)
                    curveToRelative(-0.61f, 0f, -1.14f, -0.49f, -1.21f, -1.14f)
                    lineTo(16.98f, 5f)
                    lineToRelative(1.93f, -0.01f)
                    lineToRelative(1.05f, 3.37f)
                    curveTo(20.12f, 9.03f, 19.71f, 10f, 18.77f, 10f)
                    close()
                }
            }
        }.build()
        
        return _Storefront!!
    }

private var _Storefront: ImageVector? = null


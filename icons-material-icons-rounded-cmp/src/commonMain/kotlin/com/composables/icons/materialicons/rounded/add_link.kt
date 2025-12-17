package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Add_link: ImageVector
    get() {
        if (_Add_link != null) return _Add_link!!
        
        _Add_link = ImageVector.Builder(
            name = "add_link",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(9f, 11f)
                    horizontalLineToRelative(6f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineTo(9f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(0f)
                    curveTo(8f, 11.45f, 8.45f, 11f, 9f, 11f)
                    close()
                    moveTo(20.93f, 12f)
                    lineTo(20.93f, 12f)
                    curveToRelative(0.62f, 0f, 1.07f, -0.59f, 0.93f, -1.19f)
                    curveTo(21.32f, 8.62f, 19.35f, 7f, 17f, 7f)
                    horizontalLineToRelative(-3.05f)
                    curveTo(13.43f, 7f, 13f, 7.43f, 13f, 7.95f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 0.52f, 0.43f, 0.95f, 0.95f, 0.95f)
                    horizontalLineTo(17f)
                    curveToRelative(1.45f, 0f, 2.67f, 1f, 3.01f, 2.34f)
                    curveTo(20.12f, 11.68f, 20.48f, 12f, 20.93f, 12f)
                    close()
                    moveTo(3.96f, 11.38f)
                    curveTo(4.24f, 9.91f, 5.62f, 8.9f, 7.12f, 8.9f)
                    lineToRelative(2.93f, 0f)
                    curveTo(10.57f, 8.9f, 11f, 8.47f, 11f, 7.95f)
                    verticalLineToRelative(0f)
                    curveTo(11f, 7.43f, 10.57f, 7f, 10.05f, 7f)
                    lineTo(7.22f, 7f)
                    curveToRelative(-2.61f, 0f, -4.94f, 1.91f, -5.19f, 4.51f)
                    curveTo(1.74f, 14.49f, 4.08f, 17f, 7f, 17f)
                    horizontalLineToRelative(3.05f)
                    curveToRelative(0.52f, 0f, 0.95f, -0.43f, 0.95f, -0.95f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.52f, -0.43f, -0.95f, -0.95f, -0.95f)
                    horizontalLineTo(7f)
                    curveTo(5.09f, 15.1f, 3.58f, 13.36f, 3.96f, 11.38f)
                    close()
                    moveTo(18f, 12f)
                    lineTo(18f, 12f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-2f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(2f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-2f)
                    curveTo(19f, 12.45f, 18.55f, 12f, 18f, 12f)
                    close()
                }
            }
        }.build()
        
        return _Add_link!!
    }

private var _Add_link: ImageVector? = null


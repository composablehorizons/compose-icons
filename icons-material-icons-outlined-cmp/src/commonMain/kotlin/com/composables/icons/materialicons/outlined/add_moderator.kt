package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Add_moderator: ImageVector
    get() {
        if (_Add_moderator != null) return _Add_moderator!!
        
        _Add_moderator = ImageVector.Builder(
            name = "add_moderator",
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
                        moveTo(6f, 11.09f)
                        verticalLineToRelative(-4.7f)
                        lineToRelative(6f, -2.25f)
                        lineToRelative(6f, 2.25f)
                        verticalLineToRelative(3.69f)
                        curveToRelative(0.71f, 0.1f, 1.38f, 0.31f, 2f, 0.6f)
                        verticalLineTo(5f)
                        lineToRelative(-8f, -3f)
                        lineTo(4f, 5f)
                        verticalLineToRelative(6.09f)
                        curveToRelative(0f, 5.05f, 3.41f, 9.76f, 8f, 10.91f)
                        curveToRelative(0.03f, -0.01f, 0.05f, -0.02f, 0.08f, -0.02f)
                        curveToRelative(-0.79f, -0.78f, -1.4f, -1.76f, -1.75f, -2.84f)
                        curveTo(7.76f, 17.53f, 6f, 14.42f, 6f, 11.09f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 12f)
                        curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                        reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                        reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                        reflectiveCurveTo(19.76f, 12f, 17f, 12f)
                        close()
                        moveTo(20f, 17.5f)
                        horizontalLineToRelative(-2.5f)
                        verticalLineTo(20f)
                        horizontalLineToRelative(-1f)
                        verticalLineToRelative(-2.5f)
                        horizontalLineTo(14f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(2.5f)
                        verticalLineTo(14f)
                        horizontalLineToRelative(1f)
                        verticalLineToRelative(2.5f)
                        horizontalLineTo(20f)
                        verticalLineTo(17.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Add_moderator!!
    }

private var _Add_moderator: ImageVector? = null


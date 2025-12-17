package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Menu_book: ImageVector
    get() {
        if (_Menu_book != null) return _Menu_book!!
        
        _Menu_book = ImageVector.Builder(
            name = "menu_book",
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
                        moveTo(21f, 5f)
                        curveToRelative(-1.11f, -0.35f, -2.33f, -0.5f, -3.5f, -0.5f)
                        curveToRelative(-1.95f, 0f, -4.05f, 0.4f, -5.5f, 1.5f)
                        curveToRelative(-1.45f, -1.1f, -3.55f, -1.5f, -5.5f, -1.5f)
                        reflectiveCurveTo(2.45f, 4.9f, 1f, 6f)
                        verticalLineToRelative(14.65f)
                        curveToRelative(0f, 0.25f, 0.25f, 0.5f, 0.5f, 0.5f)
                        curveToRelative(0.1f, 0f, 0.15f, -0.05f, 0.25f, -0.05f)
                        curveTo(3.1f, 20.45f, 5.05f, 20f, 6.5f, 20f)
                        curveToRelative(1.95f, 0f, 4.05f, 0.4f, 5.5f, 1.5f)
                        curveToRelative(1.35f, -0.85f, 3.8f, -1.5f, 5.5f, -1.5f)
                        curveToRelative(1.65f, 0f, 3.35f, 0.3f, 4.75f, 1.05f)
                        curveToRelative(0.1f, 0.05f, 0.15f, 0.05f, 0.25f, 0.05f)
                        curveToRelative(0.25f, 0f, 0.5f, -0.25f, 0.5f, -0.5f)
                        verticalLineTo(6f)
                        curveTo(22.4f, 5.55f, 21.75f, 5.25f, 21f, 5f)
                        close()
                        moveTo(21f, 18.5f)
                        curveToRelative(-1.1f, -0.35f, -2.3f, -0.5f, -3.5f, -0.5f)
                        curveToRelative(-1.7f, 0f, -4.15f, 0.65f, -5.5f, 1.5f)
                        verticalLineTo(8f)
                        curveToRelative(1.35f, -0.85f, 3.8f, -1.5f, 5.5f, -1.5f)
                        curveToRelative(1.2f, 0f, 2.4f, 0.15f, 3.5f, 0.5f)
                        verticalLineTo(18.5f)
                        close()
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(17.5f, 10.5f)
                            curveToRelative(0.88f, 0f, 1.73f, 0.09f, 2.5f, 0.26f)
                            verticalLineTo(9.24f)
                            curveTo(19.21f, 9.09f, 18.36f, 9f, 17.5f, 9f)
                            curveToRelative(-1.7f, 0f, -3.24f, 0.29f, -4.5f, 0.83f)
                            verticalLineToRelative(1.66f)
                            curveTo(14.13f, 10.85f, 15.7f, 10.5f, 17.5f, 10.5f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(13f, 12.49f)
                            verticalLineToRelative(1.66f)
                            curveToRelative(1.13f, -0.64f, 2.7f, -0.99f, 4.5f, -0.99f)
                            curveToRelative(0.88f, 0f, 1.73f, 0.09f, 2.5f, 0.26f)
                            verticalLineTo(11.9f)
                            curveToRelative(-0.79f, -0.15f, -1.64f, -0.24f, -2.5f, -0.24f)
                            curveTo(15.8f, 11.66f, 14.26f, 11.96f, 13f, 12.49f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(17.5f, 14.33f)
                            curveToRelative(-1.7f, 0f, -3.24f, 0.29f, -4.5f, 0.83f)
                            verticalLineToRelative(1.66f)
                            curveToRelative(1.13f, -0.64f, 2.7f, -0.99f, 4.5f, -0.99f)
                            curveToRelative(0.88f, 0f, 1.73f, 0.09f, 2.5f, 0.26f)
                            verticalLineToRelative(-1.52f)
                            curveTo(19.21f, 14.41f, 18.36f, 14.33f, 17.5f, 14.33f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Menu_book!!
    }

private var _Menu_book: ImageVector? = null


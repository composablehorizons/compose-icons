package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Tablet_android: ImageVector
    get() {
        if (_Tablet_android != null) return _Tablet_android!!
        
        _Tablet_android = ImageVector.Builder(
            name = "tablet_android",
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
                            moveTo(18f, 0f)
                            horizontalLineTo(6f)
                            curveTo(4.34f, 0f, 3f, 1.34f, 3f, 3f)
                            verticalLineToRelative(18f)
                            curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                            horizontalLineToRelative(12f)
                            curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                            verticalLineTo(3f)
                            curveTo(21f, 1.34f, 19.66f, 0f, 18f, 0f)
                            close()
                            moveTo(14f, 22f)
                            horizontalLineToRelative(-4f)
                            verticalLineToRelative(-1f)
                            horizontalLineToRelative(4f)
                            verticalLineTo(22f)
                            close()
                            moveTo(19.25f, 19f)
                            horizontalLineTo(4.75f)
                            verticalLineTo(3f)
                            horizontalLineToRelative(14.5f)
                            verticalLineTo(19f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Tablet_android!!
    }

private var _Tablet_android: ImageVector? = null


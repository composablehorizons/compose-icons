package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Import_contacts: ImageVector
    get() {
        if (_Import_contacts != null) return _Import_contacts!!
        
        _Import_contacts = ImageVector.Builder(
            name = "import_contacts",
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
                            moveTo(17.5f, 4.5f)
                            curveToRelative(-1.95f, 0f, -4.05f, 0.4f, -5.5f, 1.5f)
                            curveToRelative(-1.45f, -1.1f, -3.55f, -1.5f, -5.5f, -1.5f)
                            reflectiveCurveTo(2.45f, 4.9f, 1f, 6f)
                            verticalLineToRelative(14.65f)
                            curveToRelative(0f, 0.65f, 0.73f, 0.45f, 0.75f, 0.45f)
                            curveTo(3.1f, 20.45f, 5.05f, 20f, 6.5f, 20f)
                            curveToRelative(1.95f, 0f, 4.05f, 0.4f, 5.5f, 1.5f)
                            curveToRelative(1.35f, -0.85f, 3.8f, -1.5f, 5.5f, -1.5f)
                            curveToRelative(1.65f, 0f, 3.35f, 0.3f, 4.75f, 1.05f)
                            curveTo(22.66f, 21.26f, 23f, 20.86f, 23f, 20.6f)
                            verticalLineTo(6f)
                            curveTo(21.51f, 4.88f, 19.37f, 4.5f, 17.5f, 4.5f)
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
                    }
                }
            }
        }.build()
        
        return _Import_contacts!!
    }

private var _Import_contacts: ImageVector? = null


package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Person_add_alt_1: ImageVector
    get() {
        if (_Person_add_alt_1 != null) return _Person_add_alt_1!!
        
        _Person_add_alt_1 = ImageVector.Builder(
            name = "person_add_alt_1",
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
                        moveTo(13f, 8f)
                        arcTo(4f, 4f, 0f, false, true, 9f, 12f)
                        arcTo(4f, 4f, 0f, false, true, 5f, 8f)
                        arcTo(4f, 4f, 0f, false, true, 13f, 8f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9f, 14f)
                        curveToRelative(-2.67f, 0f, -8f, 1.34f, -8f, 4f)
                        verticalLineToRelative(1f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(14f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-1f)
                        curveTo(17f, 15.34f, 11.67f, 14f, 9f, 14f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 10f)
                        lineTo(20f, 7f)
                        lineTo(18f, 7f)
                        lineTo(18f, 10f)
                        lineTo(15f, 10f)
                        lineTo(15f, 12f)
                        lineTo(18f, 12f)
                        lineTo(18f, 15f)
                        lineTo(20f, 15f)
                        lineTo(20f, 12f)
                        lineTo(23f, 12f)
                        lineTo(23f, 10f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Person_add_alt_1!!
    }

private var _Person_add_alt_1: ImageVector? = null


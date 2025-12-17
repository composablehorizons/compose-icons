package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Shower: ImageVector
    get() {
        if (_Shower != null) return _Shower!!
        
        _Shower = ImageVector.Builder(
            name = "shower",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(9f, 17f)
                    arcTo(1f, 1f, 0f, false, true, 8f, 18f)
                    arcTo(1f, 1f, 0f, false, true, 7f, 17f)
                    arcTo(1f, 1f, 0f, false, true, 9f, 17f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(13f, 17f)
                    arcTo(1f, 1f, 0f, false, true, 12f, 18f)
                    arcTo(1f, 1f, 0f, false, true, 11f, 17f)
                    arcTo(1f, 1f, 0f, false, true, 13f, 17f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(17f, 17f)
                    arcTo(1f, 1f, 0f, false, true, 16f, 18f)
                    arcTo(1f, 1f, 0f, false, true, 15f, 17f)
                    arcTo(1f, 1f, 0f, false, true, 17f, 17f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(13f, 5.08f)
                    verticalLineTo(3f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2.08f)
                    curveTo(7.61f, 5.57f, 5f, 8.47f, 5f, 12f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(14f)
                    verticalLineToRelative(-2f)
                    curveTo(19f, 8.47f, 16.39f, 5.57f, 13f, 5.08f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(9f, 20f)
                    arcTo(1f, 1f, 0f, false, true, 8f, 21f)
                    arcTo(1f, 1f, 0f, false, true, 7f, 20f)
                    arcTo(1f, 1f, 0f, false, true, 9f, 20f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(13f, 20f)
                    arcTo(1f, 1f, 0f, false, true, 12f, 21f)
                    arcTo(1f, 1f, 0f, false, true, 11f, 20f)
                    arcTo(1f, 1f, 0f, false, true, 13f, 20f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(17f, 20f)
                    arcTo(1f, 1f, 0f, false, true, 16f, 21f)
                    arcTo(1f, 1f, 0f, false, true, 15f, 20f)
                    arcTo(1f, 1f, 0f, false, true, 17f, 20f)
                    close()
                }
            }
        }.build()
        
        return _Shower!!
    }

private var _Shower: ImageVector? = null


package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Roofing: ImageVector
    get() {
        if (_Roofing != null) return _Roofing!!
        
        _Roofing = ImageVector.Builder(
            name = "roofing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 16f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineTo(18f)
                close()
                moveTo(15f, 14f)
                horizontalLineTo(9f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineTo(14f)
                lineTo(15f, 14f)
                close()
                moveTo(19f, 9.3f)
                lineTo(19f, 9.3f)
                verticalLineTo(4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2.6f)
                verticalLineToRelative(0f)
                lineTo(12f, 3f)
                lineTo(2f, 12f)
                horizontalLineToRelative(3f)
                lineToRelative(7f, -6.31f)
                lineTo(19f, 12f)
                horizontalLineToRelative(3f)
                lineTo(19f, 9.3f)
                close()
            }
        }.build()
        
        return _Roofing!!
    }

private var _Roofing: ImageVector? = null


package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Exposure_plus_1: ImageVector
    get() {
        if (_Exposure_plus_1 != null) return _Exposure_plus_1!!
        
        _Exposure_plus_1 = ImageVector.Builder(
            name = "exposure_plus_1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 18f)
                verticalLineTo(5f)
                horizontalLineToRelative(-0.3f)
                lineTo(15f, 6.7f)
                verticalLineToRelative(1.7f)
                lineToRelative(3f, -1.02f)
                verticalLineTo(18f)
                close()
                moveToRelative(-10f, -1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineTo(7f)
                horizontalLineTo(8f)
                verticalLineToRelative(4f)
                horizontalLineTo(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
            }
        }.build()
        
        return _Exposure_plus_1!!
    }

private var _Exposure_plus_1: ImageVector? = null


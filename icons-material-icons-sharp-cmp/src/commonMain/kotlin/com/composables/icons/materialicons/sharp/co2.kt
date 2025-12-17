package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Co2: ImageVector
    get() {
        if (_Co2 != null) return _Co2!!
        
        _Co2 = ImageVector.Builder(
            name = "co2",
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
                moveTo(15f, 9f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(5f)
                verticalLineTo(9f)
                close()
                moveTo(13.5f, 13.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineTo(13.5f)
                close()
                moveTo(8f, 13f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineTo(6.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                close()
                moveTo(18.5f, 15.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                verticalLineTo(18f)
                horizontalLineTo(17f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                verticalLineTo(12f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(3.5f)
                horizontalLineTo(18.5f)
                close()
            }
        }.build()
        
        return _Co2!!
    }

private var _Co2: ImageVector? = null


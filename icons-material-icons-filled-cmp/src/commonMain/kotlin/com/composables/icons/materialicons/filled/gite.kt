package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Gite: ImageVector
    get() {
        if (_Gite != null) return _Gite!!
        
        _Gite = ImageVector.Builder(
            name = "gite",
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
                moveTo(18f, 6f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                horizontalLineTo(7f)
                verticalLineToRelative(2f)
                horizontalLineTo(6f)
                lineToRelative(-4f, 4f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-9f)
                lineTo(18f, 6f)
                close()
                moveTo(4f, 12f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(5f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                close()
                moveTo(20f, 17f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-6.17f)
                lineToRelative(2f, -2f)
                verticalLineToRelative(0f)
                lineToRelative(2f, 2f)
                verticalLineTo(17f)
                close()
            }
        }.build()
        
        return _Gite!!
    }

private var _Gite: ImageVector? = null


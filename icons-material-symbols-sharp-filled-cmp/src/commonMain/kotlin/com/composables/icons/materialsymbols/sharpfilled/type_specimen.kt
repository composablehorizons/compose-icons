package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Type_specimen: ImageVector
    get() {
        if (_Type_specimen != null) return _Type_specimen!!
        
        _Type_specimen = ImageVector.Builder(
            name = "type_specimen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(392f, 580f)
                horizontalLineToRelative(64f)
                lineToRelative(32f, -92f)
                horizontalLineToRelative(146f)
                lineToRelative(32f, 92f)
                horizontalLineToRelative(62f)
                lineTo(592f, 220f)
                horizontalLineToRelative(-64f)
                lineTo(392f, 580f)
                close()
                moveToRelative(114f, -144f)
                lineToRelative(52f, -150f)
                horizontalLineToRelative(4f)
                lineToRelative(52f, 150f)
                horizontalLineTo(506f)
                close()
                moveTo(240f, 720f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(640f)
                horizontalLineTo(240f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Type_specimen!!
    }

private var _Type_specimen: ImageVector? = null


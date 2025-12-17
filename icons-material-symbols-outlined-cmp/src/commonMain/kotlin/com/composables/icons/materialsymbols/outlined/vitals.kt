package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Vitals: ImageVector
    get() {
        if (_Vitals != null) return _Vitals!!
        
        _Vitals = ImageVector.Builder(
            name = "vitals",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 20f)
                quadToRelative(-0.475f, 0f, -0.85f, -0.275f)
                reflectiveQuadToRelative(-0.55f, -0.7f)
                lineTo(5.3f, 13f)
                horizontalLineTo(1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5.7f)
                lineTo(9f, 17.1f)
                lineToRelative(4.6f, -12.125f)
                quadToRelative(0.175f, -0.425f, 0.55f, -0.7f)
                quadTo(14.525f, 4f, 15f, 4f)
                reflectiveQuadToRelative(0.85f, 0.275f)
                quadToRelative(0.375f, 0.275f, 0.55f, 0.7f)
                lineTo(18.7f, 11f)
                horizontalLineTo(23f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5.7f)
                lineTo(15f, 6.9f)
                lineToRelative(-4.6f, 12.125f)
                quadToRelative(-0.175f, 0.425f, -0.55f, 0.7f)
                quadTo(9.475f, 20f, 9f, 20f)
                close()
            }
        }.build()
        
        return _Vitals!!
    }

private var _Vitals: ImageVector? = null


package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Vitals: ImageVector
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
                horizontalLineTo(2f)
                quadToRelative(-0.425f, 0f, -0.712f, -0.288f)
                quadTo(1f, 12.425f, 1f, 12f)
                reflectiveQuadToRelative(0.288f, -0.713f)
                quadTo(1.575f, 11f, 2f, 11f)
                horizontalLineToRelative(4f)
                quadToRelative(0.325f, 0f, 0.562f, 0.175f)
                quadToRelative(0.238f, 0.175f, 0.363f, 0.475f)
                lineTo(9f, 17.1f)
                lineToRelative(4.6f, -12.125f)
                quadToRelative(0.175f, -0.425f, 0.55f, -0.7f)
                quadTo(14.525f, 4f, 15f, 4f)
                reflectiveQuadToRelative(0.85f, 0.275f)
                quadToRelative(0.375f, 0.275f, 0.55f, 0.7f)
                lineTo(18.7f, 11f)
                horizontalLineTo(22f)
                quadToRelative(0.425f, 0f, 0.712f, 0.287f)
                quadToRelative(0.288f, 0.288f, 0.288f, 0.713f)
                reflectiveQuadToRelative(-0.288f, 0.712f)
                quadTo(22.425f, 13f, 22f, 13f)
                horizontalLineToRelative(-4f)
                quadToRelative(-0.325f, 0f, -0.562f, -0.175f)
                quadToRelative(-0.238f, -0.175f, -0.363f, -0.475f)
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


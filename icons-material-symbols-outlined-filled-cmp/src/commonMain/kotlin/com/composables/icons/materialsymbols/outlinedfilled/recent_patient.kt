package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Recent_patient: ImageVector
    get() {
        if (_Recent_patient != null) return _Recent_patient!!
        
        _Recent_patient = ImageVector.Builder(
            name = "recent_patient",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                verticalLineToRelative(-112f)
                quadToRelative(0f, -34f, 17.5f, -62.5f)
                reflectiveQuadTo(224f, 582f)
                quadToRelative(62f, -31f, 126f, -46.5f)
                reflectiveQuadTo(480f, 520f)
                quadToRelative(20f, 0f, 40f, 1.5f)
                reflectiveQuadToRelative(40f, 4.5f)
                verticalLineToRelative(274f)
                horizontalLineTo(160f)
                close()
                moveToRelative(320f, -320f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveTo(720f, 960f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                lineToRelative(-80f, 160f)
                horizontalLineToRelative(80f)
                lineTo(720f, 960f)
                close()
            }
        }.build()
        
        return _Recent_patient!!
    }

private var _Recent_patient: ImageVector? = null


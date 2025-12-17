package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Thumb_down: ImageVector
    get() {
        if (_Thumb_down != null) return _Thumb_down!!
        
        _Thumb_down = ImageVector.Builder(
            name = "thumb_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 120f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(520f)
                lineTo(360f, 920f)
                lineToRelative(-50f, -50f)
                quadToRelative(-7f, -7f, -11.5f, -19f)
                reflectiveQuadToRelative(-4.5f, -23f)
                verticalLineToRelative(-14f)
                lineToRelative(44f, -174f)
                horizontalLineTo(120f)
                quadToRelative(-32f, 0f, -56f, -24f)
                reflectiveQuadToRelative(-24f, -56f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -7f, 1.5f, -15f)
                reflectiveQuadToRelative(4.5f, -15f)
                lineToRelative(120f, -282f)
                quadToRelative(9f, -20f, 30f, -34f)
                reflectiveQuadToRelative(44f, -14f)
                close()
                moveToRelative(480f, 520f)
                verticalLineToRelative(-520f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(520f)
                horizontalLineTo(720f)
                close()
            }
        }.build()
        
        return _Thumb_down!!
    }

private var _Thumb_down: ImageVector? = null


package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Solar_power: ImageVector
    get() {
        if (_Solar_power != null) return _Solar_power!!
        
        _Solar_power = ImageVector.Builder(
            name = "solar_power",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveTo(80f, 880f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(-160f)
                horizontalLineTo(112f)
                lineTo(80f, 880f)
                close()
                moveToRelative(165f, -507f)
                lineToRelative(-57f, -56f)
                lineToRelative(85f, -85f)
                lineToRelative(57f, 56f)
                lineToRelative(-85f, 85f)
                close()
                moveTo(128f, 640f)
                horizontalLineToRelative(312f)
                verticalLineToRelative(-160f)
                horizontalLineTo(160f)
                lineToRelative(-32f, 160f)
                close()
                moveToRelative(352f, -360f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(280f, 80f)
                horizontalLineToRelative(400f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(480f, 280f)
                close()
                moveToRelative(-40f, 160f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(80f, 440f)
                horizontalLineToRelative(360f)
                lineToRelative(-32f, -160f)
                horizontalLineTo(520f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(0f, -240f)
                horizontalLineToRelative(312f)
                lineToRelative(-32f, -160f)
                horizontalLineTo(520f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(195f, -267f)
                lineToRelative(-84f, -85f)
                lineToRelative(56f, -56f)
                lineToRelative(85f, 84f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(5f, -213f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(720f)
                close()
            }
        }.build()
        
        return _Solar_power!!
    }

private var _Solar_power: ImageVector? = null


package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Outpatient_med: ImageVector
    get() {
        if (_Outpatient_med != null) return _Outpatient_med!!
        
        _Outpatient_med = ImageVector.Builder(
            name = "outpatient_med",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(779f, 621f)
                lineToRelative(-56f, -57f)
                lineToRelative(44f, -44f)
                horizontalLineTo(640f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(126f)
                lineToRelative(-43f, -43f)
                lineToRelative(57f, -57f)
                lineToRelative(140f, 140f)
                lineToRelative(-141f, 141f)
                close()
                moveTo(80f, 200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(180f, 500f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-100f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-120f)
                horizontalLineTo(380f)
                verticalLineToRelative(-100f)
                horizontalLineTo(260f)
                verticalLineToRelative(100f)
                horizontalLineTo(160f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(100f)
                close()
                moveTo(120f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 760f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 240f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(600f, 320f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(520f, 840f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Outpatient_med!!
    }

private var _Outpatient_med: ImageVector? = null


package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Vaccines: ImageVector
    get() {
        if (_Vaccines != null) return _Vaccines!!
        
        _Vaccines = ImageVector.Builder(
            name = "vaccines",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 900f)
                lineToRelative(-80f, -60f)
                verticalLineToRelative(-160f)
                horizontalLineTo(120f)
                verticalLineToRelative(-380f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(380f)
                horizontalLineTo(320f)
                verticalLineToRelative(220f)
                close()
                moveTo(200f, 600f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-60f)
                horizontalLineTo(260f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-60f)
                horizontalLineTo(260f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-60f)
                horizontalLineTo(200f)
                verticalLineToRelative(300f)
                close()
                moveTo(520f, 880f)
                verticalLineToRelative(-340f)
                quadToRelative(0f, -29f, 10f, -48f)
                reflectiveQuadToRelative(21f, -33f)
                quadToRelative(11f, -14f, 20f, -22.5f)
                reflectiveQuadToRelative(9f, -16.5f)
                verticalLineToRelative(-20f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(20f)
                quadToRelative(0f, 8f, 10f, 18f)
                reflectiveQuadToRelative(22f, 24f)
                quadToRelative(11f, 14f, 19.5f, 33f)
                reflectiveQuadToRelative(8.5f, 45f)
                verticalLineToRelative(340f)
                horizontalLineTo(520f)
                close()
                moveToRelative(80f, -320f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-20f)
                quadToRelative(0f, -15f, -9f, -26f)
                reflectiveQuadToRelative(-20f, -24f)
                quadToRelative(-11f, -13f, -21f, -29f)
                reflectiveQuadToRelative(-10f, -41f)
                verticalLineToRelative(-20f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(20f)
                quadToRelative(0f, 24f, -9.5f, 40f)
                reflectiveQuadTo(630f, 489f)
                quadToRelative(-11f, 13f, -20.5f, 24.5f)
                reflectiveQuadTo(600f, 540f)
                verticalLineToRelative(20f)
                close()
                moveToRelative(0f, 240f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-60f)
                horizontalLineTo(600f)
                verticalLineToRelative(60f)
                close()
            }
        }.build()
        
        return _Vaccines!!
    }

private var _Vaccines: ImageVector? = null


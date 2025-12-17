package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Forklift: ImageVector
    get() {
        if (_Forklift != null) return _Forklift!!
        
        _Forklift = ImageVector.Builder(
            name = "forklift",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 840f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -26f, 10f, -49.5f)
                reflectiveQuadTo(80f, 630f)
                verticalLineToRelative(-190f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(320f)
                lineToRelative(188f, 443f)
                quadToRelative(6f, 14f, 9f, 28f)
                reflectiveQuadToRelative(3f, 29f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                quadToRelative(-41f, 0f, -75.5f, -21.5f)
                reflectiveQuadTo(413f, 760f)
                horizontalLineTo(273f)
                quadToRelative(-13f, 36f, -44f, 58f)
                reflectiveQuadToRelative(-69f, 22f)
                close()
                moveToRelative(560f, -40f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(720f)
                close()
                moveToRelative(-560f, -40f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(200f, 720f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(160f, 680f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(120f, 720f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(160f, 760f)
                close()
                moveToRelative(380f, 0f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(600f, 700f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(540f, 640f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(480f, 700f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(540f, 760f)
                close()
                moveToRelative(-267f, -80f)
                horizontalLineToRelative(128f)
                quadToRelative(2f, -11f, 4.5f, -20.5f)
                reflectiveQuadTo(413f, 640f)
                horizontalLineToRelative(-90f)
                lineTo(206f, 520f)
                horizontalLineToRelative(-46f)
                verticalLineToRelative(80f)
                quadToRelative(38f, 0f, 69f, 22f)
                reflectiveQuadToRelative(44f, 58f)
                close()
                moveToRelative(84f, -120f)
                horizontalLineToRelative(189f)
                lineTo(427f, 280f)
                horizontalLineTo(240f)
                verticalLineToRelative(160f)
                lineToRelative(117f, 120f)
                close()
                moveToRelative(-34f, 80f)
                lineToRelative(-18.5f, -19f)
                quadToRelative(-18.5f, -19f, -40f, -41.5f)
                reflectiveQuadToRelative(-40f, -41f)
                lineTo(206f, 520f)
                horizontalLineToRelative(-46f)
                horizontalLineToRelative(46f)
                lineToRelative(117f, 120f)
                horizontalLineToRelative(90f)
                horizontalLineToRelative(-90f)
                close()
            }
        }.build()
        
        return _Forklift!!
    }

private var _Forklift: ImageVector? = null


package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Comments_disabled: ImageVector
    get() {
        if (_Comments_disabled != null) return _Comments_disabled!!
        
        _Comments_disabled = ImageVector.Builder(
            name = "comments_disabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 720f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 640f)
                verticalLineToRelative(-447f)
                lineToRelative(-25f, -25f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(55f, 111f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(736f, 736f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(791f, 903f)
                lineTo(607f, 720f)
                horizontalLineTo(160f)
                close()
                moveToRelative(720f, -560f)
                verticalLineToRelative(557f)
                quadToRelative(0f, 14f, -12f, 19f)
                reflectiveQuadToRelative(-22f, -5f)
                lineToRelative(-91f, -91f)
                horizontalLineToRelative(45f)
                verticalLineToRelative(-480f)
                horizontalLineTo(280f)
                quadToRelative(-20f, 0f, -30f, -12.5f)
                reflectiveQuadTo(240f, 120f)
                quadToRelative(0f, -15f, 10f, -27.5f)
                reflectiveQuadToRelative(30f, -12.5f)
                horizontalLineToRelative(520f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                close()
                moveTo(160f, 640f)
                horizontalLineToRelative(367f)
                lineToRelative(-80f, -80f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 480f)
                horizontalLineToRelative(87f)
                lineToRelative(-40f, -40f)
                horizontalLineToRelative(-47f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 400f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 360f)
                horizontalLineToRelative(25f)
                verticalLineToRelative(58f)
                lineTo(160f, 273f)
                verticalLineToRelative(367f)
                close()
                moveToRelative(560f, -120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 560f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(640f, 520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 520f)
                close()
                moveToRelative(-40f, -80f)
                horizontalLineTo(572f)
                quadToRelative(-20f, 0f, -30f, -12.5f)
                reflectiveQuadTo(532f, 400f)
                quadToRelative(0f, -15f, 10f, -27.5f)
                reflectiveQuadToRelative(30f, -12.5f)
                horizontalLineToRelative(108f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 400f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 440f)
                close()
                moveToRelative(0f, -120f)
                horizontalLineTo(452f)
                quadToRelative(-20f, 0f, -30f, -12.5f)
                reflectiveQuadTo(412f, 280f)
                quadToRelative(0f, -15f, 10f, -27.5f)
                reflectiveQuadToRelative(30f, -12.5f)
                horizontalLineToRelative(228f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 280f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 320f)
                close()
                moveTo(344f, 456f)
                close()
                moveToRelative(171f, -56f)
                close()
            }
        }.build()
        
        return _Comments_disabled!!
    }

private var _Comments_disabled: ImageVector? = null


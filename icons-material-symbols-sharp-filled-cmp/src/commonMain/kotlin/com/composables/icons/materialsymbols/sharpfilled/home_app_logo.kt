package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Home_app_logo: ImageVector
    get() {
        if (_Home_app_logo != null) return _Home_app_logo!!
        
        _Home_app_logo = ImageVector.Builder(
            name = "home_app_logo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(180f, 840f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(120f, 780f)
                verticalLineToRelative(-76f)
                lineToRelative(160f, -142f)
                verticalLineToRelative(278f)
                horizontalLineTo(180f)
                close()
                moveToRelative(140f, 0f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(160f)
                horizontalLineTo(320f)
                close()
                moveToRelative(360f, 0f)
                verticalLineToRelative(-328f)
                lineTo(509f, 360f)
                lineToRelative(121f, -107f)
                lineToRelative(190f, 169f)
                quadToRelative(10f, 9f, 15f, 20.5f)
                reflectiveQuadToRelative(5f, 24.5f)
                verticalLineToRelative(313f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(780f, 840f)
                horizontalLineTo(680f)
                close()
                moveTo(120f, 650f)
                verticalLineToRelative(-183f)
                quadToRelative(0f, -13f, 5f, -25f)
                reflectiveQuadToRelative(15f, -20f)
                lineToRelative(300f, -266f)
                quadToRelative(8f, -8f, 18.5f, -11.5f)
                reflectiveQuadTo(480f, 141f)
                quadToRelative(11f, 0f, 21.5f, 3.5f)
                reflectiveQuadTo(520f, 156f)
                lineToRelative(80f, 71f)
                lineToRelative(-480f, 423f)
                close()
            }
        }.build()
        
        return _Home_app_logo!!
    }

private var _Home_app_logo: ImageVector? = null


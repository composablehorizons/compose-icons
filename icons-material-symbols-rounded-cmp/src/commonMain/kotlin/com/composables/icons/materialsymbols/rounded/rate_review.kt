package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Rate_review: ImageVector
    get() {
        if (_Rate_review != null) return _Rate_review!!
        
        _Rate_review = ImageVector.Builder(
            name = "rate_review",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 560f)
                horizontalLineToRelative(65f)
                quadToRelative(8f, 0f, 15.5f, -3f)
                reflectiveQuadToRelative(13.5f, -9f)
                lineToRelative(188f, -188f)
                quadToRelative(9f, -9f, 13.5f, -20.5f)
                reflectiveQuadTo(580f, 317f)
                quadToRelative(0f, -11f, -5f, -21.5f)
                reflectiveQuadTo(562f, 276f)
                lineToRelative(-36f, -38f)
                quadToRelative(-9f, -9f, -20f, -13.5f)
                reflectiveQuadToRelative(-23f, -4.5f)
                quadToRelative(-11f, 0f, -22.5f, 4.5f)
                reflectiveQuadTo(440f, 238f)
                lineTo(252f, 426f)
                quadToRelative(-6f, 6f, -9f, 13.5f)
                reflectiveQuadToRelative(-3f, 15.5f)
                verticalLineToRelative(65f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 560f)
                close()
                moveToRelative(240f, -243f)
                lineToRelative(-37f, -37f)
                lineToRelative(37f, 37f)
                close()
                moveTo(300f, 500f)
                verticalLineToRelative(-38f)
                lineToRelative(101f, -101f)
                lineToRelative(20f, 18f)
                lineToRelative(18f, 20f)
                lineToRelative(-101f, 101f)
                horizontalLineToRelative(-38f)
                close()
                moveToRelative(121f, -121f)
                lineToRelative(18f, 20f)
                lineToRelative(-38f, -38f)
                lineToRelative(20f, 18f)
                close()
                moveToRelative(26f, 181f)
                horizontalLineToRelative(233f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 480f)
                horizontalLineTo(527f)
                lineToRelative(-80f, 80f)
                close()
                moveTo(240f, 720f)
                lineToRelative(-92f, 92f)
                quadToRelative(-19f, 19f, -43.5f, 8.5f)
                reflectiveQuadTo(80f, 783f)
                verticalLineToRelative(-623f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 720f)
                horizontalLineTo(240f)
                close()
                moveToRelative(-34f, -80f)
                horizontalLineToRelative(594f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(525f)
                lineToRelative(46f, -45f)
                close()
                moveToRelative(-46f, 0f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Rate_review!!
    }

private var _Rate_review: ImageVector? = null


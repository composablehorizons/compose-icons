package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Domain_verification_off: ImageVector
    get() {
        if (_Domain_verification_off != null) return _Domain_verification_off!!
        
        _Domain_verification_off = ImageVector.Builder(
            name = "domain_verification_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(818f, 932f)
                lineTo(686f, 800f)
                horizontalLineTo(80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(114f)
                lineTo(26f, 140f)
                lineToRelative(57f, -57f)
                lineTo(875f, 875f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(160f, 720f)
                horizontalLineToRelative(446f)
                lineTo(206f, 320f)
                horizontalLineToRelative(-46f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(711f, 37f)
                lineToRelative(-71f, -71f)
                verticalLineToRelative(-366f)
                horizontalLineTo(434f)
                lineTo(274f, 160f)
                horizontalLineToRelative(606f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 10f, -2f, 19.5f)
                reflectiveQuadToRelative(-7f, 17.5f)
                close()
                moveTo(607f, 493f)
                lineToRelative(-58f, -58f)
                lineToRelative(57f, -57f)
                lineToRelative(58f, 58f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(-57f, 57f)
                lineTo(438f, 662f)
                lineTo(296f, 520f)
                lineToRelative(58f, -58f)
                lineToRelative(84f, 84f)
                lineToRelative(54f, -54f)
                lineToRelative(58f, 58f)
                close()
            }
        }.build()
        
        return _Domain_verification_off!!
    }

private var _Domain_verification_off: ImageVector? = null


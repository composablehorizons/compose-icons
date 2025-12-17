package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Hdr_auto_select: ImageVector
    get() {
        if (_Hdr_auto_select != null) return _Hdr_auto_select!!
        
        _Hdr_auto_select = ImageVector.Builder(
            name = "hdr_auto_select",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(438f, 328f)
                lineToRelative(40f, -116f)
                horizontalLineToRelative(4f)
                lineToRelative(40f, 116f)
                horizontalLineToRelative(-84f)
                close()
                moveToRelative(42f, 232f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadToRelative(-70f, -170f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                quadToRelative(0f, 100f, -70f, 170f)
                reflectiveQuadToRelative(-170f, 70f)
                close()
                moveTo(350f, 440f)
                horizontalLineToRelative(48f)
                lineToRelative(26f, -72f)
                horizontalLineToRelative(112f)
                lineToRelative(26f, 72f)
                horizontalLineToRelative(48f)
                lineTo(504f, 160f)
                horizontalLineToRelative(-50f)
                lineTo(350f, 440f)
                close()
                moveTo(820f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(-300f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(156f)
                horizontalLineToRelative(-36f)
                lineToRelative(36f, 84f)
                horizontalLineToRelative(-60f)
                lineToRelative(-36f, -80f)
                horizontalLineToRelative(-44f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(60f, -140f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                close()
                moveTo(0f, 880f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-100f)
                horizontalLineTo(60f)
                verticalLineToRelative(100f)
                horizontalLineTo(0f)
                close()
                moveToRelative(260f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(170f)
                lineToRelative(30f, 30f)
                verticalLineToRelative(180f)
                lineToRelative(-30f, 30f)
                horizontalLineTo(260f)
                close()
                moveToRelative(60f, -60f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Hdr_auto_select!!
    }

private var _Hdr_auto_select: ImageVector? = null


package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Tamper_detection_on: ImageVector
    get() {
        if (_Tamper_detection_on != null) return _Tamper_detection_on!!
        
        _Tamper_detection_on = ImageVector.Builder(
            name = "tamper_detection_on",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(178f, 800f)
                quadToRelative(-17f, 0f, -31.5f, -6.5f)
                reflectiveQuadTo(121f, 776f)
                lineTo(0f, 656f)
                lineToRelative(14f, -14f)
                quadToRelative(9f, -9f, 20f, -13.5f)
                reflectiveQuadToRelative(22f, -4.5f)
                quadToRelative(12f, 0f, 23f, 4.5f)
                reflectiveQuadTo(98f, 642f)
                lineToRelative(22f, 22f)
                verticalLineToRelative(-294f)
                quadToRelative(0f, -13f, 9f, -21.5f)
                reflectiveQuadToRelative(21f, -8.5f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(180f, 370f)
                verticalLineToRelative(150f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-210f)
                quadToRelative(0f, -13f, 9f, -21.5f)
                reflectiveQuadToRelative(21f, -8.5f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(280f, 310f)
                verticalLineToRelative(210f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-170f)
                quadToRelative(0f, -13f, 9f, -21.5f)
                reflectiveQuadToRelative(21f, -8.5f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(380f, 350f)
                verticalLineToRelative(170f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-130f)
                quadToRelative(0f, -13f, 9f, -21.5f)
                reflectiveQuadToRelative(21f, -8.5f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(480f, 390f)
                verticalLineToRelative(330f)
                quadToRelative(0f, 33f, -23f, 56.5f)
                reflectiveQuadTo(400f, 800f)
                horizontalLineTo(178f)
                close()
                moveToRelative(382f, -120f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 240f)
                horizontalLineTo(80f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 40f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 120f)
                verticalLineToRelative(180f)
                lineToRelative(160f, -160f)
                verticalLineToRelative(440f)
                lineTo(720f, 420f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 680f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Tamper_detection_on!!
    }

private var _Tamper_detection_on: ImageVector? = null


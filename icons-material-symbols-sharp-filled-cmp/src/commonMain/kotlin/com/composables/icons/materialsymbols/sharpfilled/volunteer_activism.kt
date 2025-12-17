package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Volunteer_activism: ImageVector
    get() {
        if (_Volunteer_activism != null) return _Volunteer_activism!!
        
        _Volunteer_activism = ImageVector.Builder(
            name = "volunteer_activism",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 880f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-440f)
                horizontalLineTo(40f)
                verticalLineToRelative(440f)
                close()
                moveToRelative(520f, 0f)
                lineToRelative(320f, -120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(520f)
                lineToRelative(-84f, -30f)
                lineToRelative(14f, -37f)
                lineToRelative(70f, 27f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                lineTo(359f, 440f)
                horizontalLineToRelative(-79f)
                verticalLineToRelative(361f)
                lineToRelative(280f, 79f)
                close()
                moveToRelative(80f, -360f)
                lineTo(474f, 358f)
                quadToRelative(-31f, -30f, -52.5f, -66.5f)
                reflectiveQuadTo(400f, 212f)
                quadToRelative(0f, -55f, 38.5f, -93.5f)
                reflectiveQuadTo(532f, 80f)
                quadToRelative(32f, 0f, 60f, 13.5f)
                reflectiveQuadToRelative(48f, 36.5f)
                quadToRelative(20f, -23f, 48f, -36.5f)
                reflectiveQuadToRelative(60f, -13.5f)
                quadToRelative(55f, 0f, 93.5f, 38.5f)
                reflectiveQuadTo(880f, 212f)
                quadToRelative(0f, 43f, -21f, 79.5f)
                reflectiveQuadTo(807f, 358f)
                lineTo(640f, 520f)
                close()
            }
        }.build()
        
        return _Volunteer_activism!!
    }

private var _Volunteer_activism: ImageVector? = null


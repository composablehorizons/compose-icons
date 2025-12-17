package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Volunteer_activism: ImageVector
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
                moveTo(280f, 801f)
                verticalLineToRelative(-361f)
                horizontalLineToRelative(64f)
                quadToRelative(7f, 0f, 14f, 1.5f)
                reflectiveQuadToRelative(14f, 3.5f)
                lineToRelative(277f, 103f)
                quadToRelative(14f, 5f, 22.5f, 18f)
                reflectiveQuadToRelative(8.5f, 27f)
                quadToRelative(0f, 21f, -14.5f, 34f)
                reflectiveQuadTo(632f, 640f)
                horizontalLineTo(527f)
                quadToRelative(-5f, 0f, -7.5f, -0.5f)
                reflectiveQuadTo(513f, 637f)
                lineToRelative(-64f, -25f)
                lineToRelative(-13f, 39f)
                lineToRelative(77f, 27f)
                quadToRelative(2f, 1f, 6f, 1.5f)
                reflectiveQuadToRelative(7f, 0.5f)
                horizontalLineToRelative(274f)
                quadToRelative(32f, 0f, 56f, 23f)
                reflectiveQuadToRelative(24f, 57f)
                lineTo(561f, 880f)
                lineToRelative(-281f, -79f)
                close()
                moveTo(40f, 880f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(440f)
                horizontalLineTo(40f)
                close()
                moveToRelative(600f, -360f)
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


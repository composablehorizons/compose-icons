package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Fitness_trackers: ImageVector
    get() {
        if (_Fitness_trackers != null) return _Fitness_trackers!!
        
        _Fitness_trackers = ImageVector.Builder(
            name = "fitness_trackers",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 880f)
                lineToRelative(-36f, -120f)
                horizontalLineTo(80f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(44f)
                lineToRelative(36f, -120f)
                horizontalLineToRelative(240f)
                lineToRelative(36f, 120f)
                horizontalLineToRelative(44f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(-44f)
                lineTo(400f, 880f)
                horizontalLineTo(160f)
                close()
                moveToRelative(60f, -80f)
                horizontalLineToRelative(120f)
                lineToRelative(12f, -40f)
                horizontalLineTo(208f)
                lineToRelative(12f, 40f)
                close()
                moveToRelative(-60f, -120f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-400f)
                horizontalLineTo(160f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(48f, -480f)
                horizontalLineToRelative(144f)
                lineToRelative(-12f, -40f)
                horizontalLineTo(220f)
                lineToRelative(-12f, 40f)
                close()
                moveTo(560f, 880f)
                verticalLineToRelative(-520f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(520f)
                horizontalLineTo(560f)
                close()
                moveToRelative(80f, -540f)
                verticalLineToRelative(460f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-460f)
                horizontalLineTo(640f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-100f)
                horizontalLineTo(640f)
                verticalLineToRelative(100f)
                close()
                moveTo(280f, 760f)
                close()
                moveToRelative(0f, -560f)
                close()
            }
        }.build()
        
        return _Fitness_trackers!!
    }

private var _Fitness_trackers: ImageVector? = null


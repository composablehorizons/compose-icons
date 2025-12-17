package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Checkbook: ImageVector
    get() {
        if (_Checkbook != null) return _Checkbook!!
        
        _Checkbook = ImageVector.Builder(
            name = "checkbook",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 760f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                lineTo(600f, 520f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(280f)
                lineTo(360f, 760f)
                horizontalLineTo(80f)
                close()
                moveToRelative(160f, -320f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(280f, 400f)
                verticalLineToRelative(-70f)
                lineToRelative(266f, -266f)
                lineToRelative(70f, 70f)
                lineToRelative(-266f, 266f)
                horizontalLineToRelative(-70f)
                close()
                moveToRelative(360f, -290f)
                lineToRelative(-70f, -70f)
                lineToRelative(36f, -36f)
                quadToRelative(5f, -5f, 11f, -5f)
                reflectiveQuadToRelative(11f, 5f)
                lineToRelative(48f, 48f)
                quadToRelative(5f, 5f, 5f, 11f)
                reflectiveQuadToRelative(-5f, 11f)
                lineToRelative(-36f, 36f)
                close()
            }
        }.build()
        
        return _Checkbook!!
    }

private var _Checkbook: ImageVector? = null


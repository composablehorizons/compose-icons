package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.No_luggage: ImageVector
    get() {
        if (_No_luggage != null) return _No_luggage!!
        
        _No_luggage = ImageVector.Builder(
            name = "no_luggage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 880f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-527f)
                lineTo(27f, 140f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                lineToRelative(-101f, -101f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-38f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-40f)
                horizontalLineTo(360f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(80f, -160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-167f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(247f)
                close()
                moveToRelative(160f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-7f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(87f)
                close()
                moveToRelative(240f, -75f)
                lineTo(600f, 485f)
                verticalLineToRelative(-125f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(45f)
                lineTo(360f, 245f)
                verticalLineToRelative(-165f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(405f)
                close()
                moveTo(440f, 240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _No_luggage!!
    }

private var _No_luggage: ImageVector? = null


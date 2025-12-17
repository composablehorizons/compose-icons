package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Tamper_detection_on: ImageVector
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
                moveTo(560f, 680f)
                verticalLineToRelative(-440f)
                horizontalLineTo(80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(260f)
                lineToRelative(160f, -160f)
                verticalLineToRelative(440f)
                lineTo(720f, 420f)
                verticalLineToRelative(260f)
                horizontalLineTo(560f)
                close()
                moveToRelative(-80f, 120f)
                horizontalLineTo(145f)
                lineTo(0f, 656f)
                lineToRelative(56f, -56f)
                lineToRelative(64f, 64f)
                verticalLineToRelative(-324f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(180f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(440f)
                close()
            }
        }.build()
        
        return _Tamper_detection_on!!
    }

private var _Tamper_detection_on: ImageVector? = null


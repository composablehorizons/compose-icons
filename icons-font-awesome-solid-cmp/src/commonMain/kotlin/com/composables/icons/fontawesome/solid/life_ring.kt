package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.LifeRing: ImageVector
    get() {
        if (_LifeRing != null) return _LifeRing!!
        
        _LifeRing = ImageVector.Builder(
            name = "life-ring",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 8f)
                curveTo(119.033f, 8f, 8f, 119.033f, 8f, 256f)
                reflectiveCurveToRelative(111.033f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111.033f, 248f, -248f)
                reflectiveCurveTo(392.967f, 8f, 256f, 8f)
                close()
                moveToRelative(173.696f, 119.559f)
                lineToRelative(-63.399f, 63.399f)
                curveToRelative(-10.987f, -18.559f, -26.67f, -34.252f, -45.255f, -45.255f)
                lineToRelative(63.399f, -63.399f)
                arcToRelative(218.396f, 218.396f, 0f, false, true, 45.255f, 45.255f)
                close()
                moveTo(256f, 352f)
                curveToRelative(-53.019f, 0f, -96f, -42.981f, -96f, -96f)
                reflectiveCurveToRelative(42.981f, -96f, 96f, -96f)
                reflectiveCurveToRelative(96f, 42.981f, 96f, 96f)
                reflectiveCurveToRelative(-42.981f, 96f, -96f, 96f)
                close()
                moveTo(127.559f, 82.304f)
                lineToRelative(63.399f, 63.399f)
                curveToRelative(-18.559f, 10.987f, -34.252f, 26.67f, -45.255f, 45.255f)
                lineToRelative(-63.399f, -63.399f)
                arcToRelative(218.372f, 218.372f, 0f, false, true, 45.255f, -45.255f)
                close()
                moveTo(82.304f, 384.441f)
                lineToRelative(63.399f, -63.399f)
                curveToRelative(10.987f, 18.559f, 26.67f, 34.252f, 45.255f, 45.255f)
                lineToRelative(-63.399f, 63.399f)
                arcToRelative(218.396f, 218.396f, 0f, false, true, -45.255f, -45.255f)
                close()
                moveToRelative(302.137f, 45.255f)
                lineToRelative(-63.399f, -63.399f)
                curveToRelative(18.559f, -10.987f, 34.252f, -26.67f, 45.255f, -45.255f)
                lineToRelative(63.399f, 63.399f)
                arcToRelative(218.403f, 218.403f, 0f, false, true, -45.255f, 45.255f)
                close()
            }
        }.build()
        
        return _LifeRing!!
    }

private var _LifeRing: ImageVector? = null


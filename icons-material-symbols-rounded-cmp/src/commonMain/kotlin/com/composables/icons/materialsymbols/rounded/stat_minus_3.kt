package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Stat_minus_3: ImageVector
    get() {
        if (_Stat_minus_3 != null) return _Stat_minus_3!!
        
        _Stat_minus_3 = ImageVector.Builder(
            name = "stat_minus_3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 764f)
                lineToRelative(156f, -155f)
                quadToRelative(11f, -11f, 27.5f, -11.5f)
                reflectiveQuadTo(692f, 609f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineTo(537f, 820f)
                quadToRelative(-23f, 23f, -57f, 23f)
                reflectiveQuadToRelative(-57f, -23f)
                lineTo(268f, 665f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(268f, 609f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(156f, 155f)
                close()
                moveToRelative(0f, -238f)
                lineToRelative(156f, -155f)
                quadToRelative(11f, -11f, 27.5f, -11.5f)
                reflectiveQuadTo(692f, 371f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineTo(537f, 582f)
                quadToRelative(-23f, 23f, -57f, 23f)
                reflectiveQuadToRelative(-57f, -23f)
                lineTo(268f, 427f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(268f, 371f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(156f, 155f)
                close()
                moveToRelative(0f, -238f)
                lineToRelative(156f, -155f)
                quadToRelative(11f, -11f, 27.5f, -11.5f)
                reflectiveQuadTo(692f, 133f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineTo(537f, 344f)
                quadToRelative(-23f, 23f, -57f, 23f)
                reflectiveQuadToRelative(-57f, -23f)
                lineTo(268f, 189f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(268f, 133f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(156f, 155f)
                close()
            }
        }.build()
        
        return _Stat_minus_3!!
    }

private var _Stat_minus_3: ImageVector? = null


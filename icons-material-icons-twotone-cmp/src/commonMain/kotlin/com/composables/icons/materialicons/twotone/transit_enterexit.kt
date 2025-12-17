package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Transit_enterexit: ImageVector
    get() {
        if (_Transit_enterexit != null) return _Transit_enterexit!!
        
        _Transit_enterexit = ImageVector.Builder(
            name = "transit_enterexit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.98f, 6f)
                lineTo(9f, 12.77f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4.85f)
                lineTo(18f, 8.03f)
                close()
            }
        }.build()
        
        return _Transit_enterexit!!
    }

private var _Transit_enterexit: ImageVector? = null


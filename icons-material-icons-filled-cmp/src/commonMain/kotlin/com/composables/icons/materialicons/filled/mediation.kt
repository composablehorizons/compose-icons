package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Mediation: ImageVector
    get() {
        if (_Mediation != null) return _Mediation!!
        
        _Mediation = ImageVector.Builder(
            name = "mediation",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22f, 12f)
                lineToRelative(-4f, 4f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(18.17f, 13f)
                horizontalLineToRelative(-5.23f)
                curveToRelative(-0.34f, 3.1f, -2.26f, 5.72f, -4.94f, 7.05f)
                curveTo(7.96f, 21.69f, 6.64f, 23f, 5f, 23f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                curveToRelative(0.95f, 0f, 1.78f, 0.45f, 2.33f, 1.14f)
                curveToRelative(1.9f, -1.03f, 3.26f, -2.91f, 3.58f, -5.14f)
                horizontalLineToRelative(-3.1f)
                curveTo(7.4f, 14.16f, 6.3f, 15f, 5f, 15f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                curveToRelative(1.3f, 0f, 2.4f, 0.84f, 2.82f, 2f)
                horizontalLineToRelative(3.1f)
                curveToRelative(-0.32f, -2.23f, -1.69f, -4.1f, -3.59f, -5.14f)
                curveTo(6.78f, 6.55f, 5.95f, 7f, 5f, 7f)
                curveTo(3.34f, 7f, 2f, 5.66f, 2f, 4f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                curveToRelative(1.64f, 0f, 2.96f, 1.31f, 2.99f, 2.95f)
                curveToRelative(2.68f, 1.33f, 4.6f, 3.95f, 4.94f, 7.05f)
                horizontalLineToRelative(5.23f)
                lineToRelative(-1.58f, -1.59f)
                lineTo(18f, 8f)
                lineToRelative(4f, 4f)
                close()
            }
        }.build()
        
        return _Mediation!!
    }

private var _Mediation: ImageVector? = null


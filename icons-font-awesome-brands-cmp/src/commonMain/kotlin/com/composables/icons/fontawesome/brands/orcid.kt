package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Orcid: ImageVector
    get() {
        if (_Orcid != null) return _Orcid!!
        
        _Orcid = ImageVector.Builder(
            name = "orcid",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(294.75f, 188.19f)
                horizontalLineToRelative(-45.92f)
                verticalLineTo(342f)
                horizontalLineToRelative(47.47f)
                curveToRelative(67.62f, 0f, 83.12f, -51.34f, 83.12f, -76.91f)
                curveToRelative(0f, -41.64f, -26.54f, -76.9f, -84.67f, -76.9f)
                close()
                moveTo(256f, 8f)
                curveTo(119f, 8f, 8f, 119f, 8f, 256f)
                reflectiveCurveToRelative(111f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111f, 248f, -248f)
                reflectiveCurveTo(393f, 8f, 256f, 8f)
                close()
                moveToRelative(-80.79f, 360.76f)
                horizontalLineToRelative(-29.84f)
                verticalLineToRelative(-207.5f)
                horizontalLineToRelative(29.84f)
                close()
                moveToRelative(-14.92f, -231.14f)
                arcToRelative(19.57f, 19.57f, 0f, true, true, 19.57f, -19.57f)
                arcToRelative(19.64f, 19.64f, 0f, false, true, -19.57f, 19.57f)
                close()
                moveTo(300f, 369f)
                horizontalLineToRelative(-81f)
                verticalLineTo(161.26f)
                horizontalLineToRelative(80.6f)
                curveToRelative(76.73f, 0f, 110.44f, 54.83f, 110.44f, 103.85f)
                curveTo(410f, 318.39f, 368.38f, 369f, 300f, 369f)
                close()
            }
        }.build()
        
        return _Orcid!!
    }

private var _Orcid: ImageVector? = null


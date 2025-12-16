package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.LetterCaseToggle: ImageVector
    get() {
        if (_LetterCaseToggle != null) return _LetterCaseToggle!!
        
        _LetterCaseToggle = ImageVector.Builder(
            name = "letter-case-toggle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.2891f, 2.74992f)
                curveTo(11.4959f, 2.7498f, 11.6814f, 2.87731f, 11.7559f, 3.07023f)
                lineTo(14.9658f, 11.3893f)
                lineTo(14.9931f, 11.487f)
                curveTo(15.0318f, 11.7163f, 14.9049f, 11.9487f, 14.6796f, 12.0358f)
                curveTo(14.4542f, 12.1227f, 14.2045f, 12.0353f, 14.0791f, 11.8395f)
                lineTo(14.0332f, 11.7497f)
                lineTo(12.9824f, 9.02513f)
                horizontalLineTo(9.61044f)
                lineTo(8.56653f, 11.7487f)
                lineTo(8.52063f, 11.8395f)
                curveTo(8.39552f, 12.035f, 8.1463f, 12.1228f, 7.92104f, 12.0368f)
                curveTo(7.6633f, 11.9379f, 7.53415f, 11.6481f, 7.63296f, 11.3903f)
                lineTo(10.8233f, 3.0712f)
                lineTo(10.8555f, 3.00187f)
                curveTo(10.9434f, 2.84803f, 11.1082f, 2.75023f, 11.2891f, 2.74992f)
                close()
                moveTo(2.89872f, 5.20688f)
                curveTo(3.79233f, 5.20688f, 4.60458f, 5.60197f, 5.15354f, 6.22443f)
                verticalLineTo(5.71956f)
                curveTo(5.15369f, 5.4713f, 5.35547f, 5.26959f, 5.60372f, 5.26938f)
                curveTo(5.85215f, 5.26938f, 6.05376f, 5.47117f, 6.0539f, 5.71956f)
                verticalLineTo(11.529f)
                curveTo(6.0539f, 11.7775f, 5.85224f, 11.9792f, 5.60372f, 11.9792f)
                curveTo(5.35538f, 11.9789f, 5.15354f, 11.7774f, 5.15354f, 11.529f)
                verticalLineTo(11.0192f)
                curveTo(4.57351f, 11.6672f, 3.72158f, 12.0124f, 2.89872f, 12.0124f)
                curveTo(1.35806f, 12.0123f, 0.00915501f, 10.633f, 0.00915501f, 8.60913f)
                curveTo(0.00930358f, 6.68538f, 1.25817f, 5.20697f, 2.89872f, 5.20688f)
                close()
                moveTo(3.08622f, 6.05744f)
                curveTo(2.10849f, 6.05772f, 1.03557f, 6.9658f, 1.03549f, 8.60913f)
                curveTo(1.03549f, 10.1526f, 2.00852f, 11.1605f, 3.08622f, 11.1608f)
                curveTo(3.97048f, 11.1608f, 4.77161f, 10.4924f, 5.15354f, 9.79464f)
                verticalLineTo(7.30546f)
                curveTo(4.76371f, 6.58316f, 3.94195f, 6.05744f, 3.08622f, 6.05744f)
                close()
                moveTo(9.93661f, 8.17555f)
                horizontalLineTo(12.6543f)
                lineTo(11.2911f, 4.64245f)
                lineTo(9.93661f, 8.17555f)
                close()
            }
        }.build()
        
        return _LetterCaseToggle!!
    }

private var _LetterCaseToggle: ImageVector? = null

